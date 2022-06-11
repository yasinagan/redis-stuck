package redis.stackftw;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.Indexed;
import com.redis.om.spring.annotations.Searchable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Grades
{

    @Indexed
    @Id
    private String id;

    private String lastName;
    @Searchable
    private String firstName;
    private String ssn;
    private String test1;
    private String test2;
    private String test3;
    private String test4;
    @Searchable
    private String finalNote;

    @Searchable
    private String grade;
}
