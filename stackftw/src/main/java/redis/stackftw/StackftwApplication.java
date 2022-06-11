package redis.stackftw;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;
import com.redis.om.spring.annotations.Searchable;
import com.redis.om.spring.repository.RedisDocumentRepository;
import com.redis.om.spring.search.stream.EntityStream;
import com.redis.om.spring.search.stream.SearchStream;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.index.Indexed;
import redis.clients.jedis.Client;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.Collator;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@EnableRedisDocumentRepositories
@SpringBootApplication
public class StackftwApplication
{

    public static void main(String[] args){SpringApplication.run(StackftwApplication.class, args);}

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository repository,
                                        @Value("file:///${HOME}/Desktop/trees.csv") File file)
    {

        repository.deleteAll();

        return args -> {
            var data = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8)
                    .stream()
                    .map(l -> l.split(","))
                    .skip(1)
                    .map(ar -> new Trees(null, ar[0], ar[1], ar[2]))
                    .limit(30)
                    .toList();

            //log(stream.of(Trees.class).collect(Collectors.toList()));

            repository.saveAll(data);
            log(repository.findAll());
            log(repository.findByGirth("01G5A1X6E7VHAT9BNSYJW791HR"));


        };
    }

    private static void log(Iterable<?> iterable)
    {
        System.out.println("-------------------");
        iterable.forEach(System.out::println);
    }
}

interface PersonRepository extends RedisDocumentRepository<Trees, String>
{
    Collection<Trees> findByGirth(String girth);

}


