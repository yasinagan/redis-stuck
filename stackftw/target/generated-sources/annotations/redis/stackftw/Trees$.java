package redis.stackftw;

import com.redis.om.spring.metamodel.FieldOperationInterceptor;
import java.lang.NoSuchFieldException;
import java.lang.SecurityException;
import java.lang.String;
import java.lang.reflect.Field;

public final class Trees$ {
  public static Field girth;

  public static Field id;

  public static Field volume;

  public static Field height;

  public static FieldOperationInterceptor<Trees, String> GIRTH;

  public static FieldOperationInterceptor<Trees, String> ID;

  public static FieldOperationInterceptor<Trees, String> VOLUME;

  public static FieldOperationInterceptor<Trees, String> HEIGHT;

  static {
    try {
      girth = Trees.class.getDeclaredField("girth");
      id = Trees.class.getDeclaredField("id");
      volume = Trees.class.getDeclaredField("volume");
      height = Trees.class.getDeclaredField("height");
      GIRTH = new FieldOperationInterceptor<Trees, String>(girth,false);
      ID = new FieldOperationInterceptor<Trees, String>(id,false);
      VOLUME = new FieldOperationInterceptor<Trees, String>(volume,false);
      HEIGHT = new FieldOperationInterceptor<Trees, String>(height,false);
    } catch(NoSuchFieldException | SecurityException e) {
      System.err.println(e.getMessage());
    }
  }
}
