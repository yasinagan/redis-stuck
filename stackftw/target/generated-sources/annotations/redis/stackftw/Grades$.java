package redis.stackftw;

import com.redis.om.spring.metamodel.FieldOperationInterceptor;
import com.redis.om.spring.metamodel.TagFieldOperationInterceptor;
import com.redis.om.spring.metamodel.TextFieldOperationInterceptor;
import java.lang.NoSuchFieldException;
import java.lang.SecurityException;
import java.lang.String;
import java.lang.reflect.Field;

public final class Grades$ {
  public static Field id;

  public static Field ssn;

  public static Field lastName;

  public static Field finalNote;

  public static Field firstName;

  public static Field test4;

  public static Field test2;

  public static Field test1;

  public static Field grade;

  public static Field test3;

  public static TagFieldOperationInterceptor<Grades, String> ID;

  public static FieldOperationInterceptor<Grades, String> SSN;

  public static FieldOperationInterceptor<Grades, String> LAST_NAME;

  public static TextFieldOperationInterceptor<Grades, String> FINAL_NOTE;

  public static TextFieldOperationInterceptor<Grades, String> FIRST_NAME;

  public static FieldOperationInterceptor<Grades, String> TEST4;

  public static FieldOperationInterceptor<Grades, String> TEST2;

  public static FieldOperationInterceptor<Grades, String> TEST1;

  public static TextFieldOperationInterceptor<Grades, String> GRADE;

  public static FieldOperationInterceptor<Grades, String> TEST3;

  static {
    try {
      id = Grades.class.getDeclaredField("id");
      ssn = Grades.class.getDeclaredField("ssn");
      lastName = Grades.class.getDeclaredField("lastName");
      finalNote = Grades.class.getDeclaredField("finalNote");
      firstName = Grades.class.getDeclaredField("firstName");
      test4 = Grades.class.getDeclaredField("test4");
      test2 = Grades.class.getDeclaredField("test2");
      test1 = Grades.class.getDeclaredField("test1");
      grade = Grades.class.getDeclaredField("grade");
      test3 = Grades.class.getDeclaredField("test3");
      ID = new TagFieldOperationInterceptor<Grades, String>(id,true);
      SSN = new FieldOperationInterceptor<Grades, String>(ssn,false);
      LAST_NAME = new FieldOperationInterceptor<Grades, String>(lastName,false);
      FINAL_NOTE = new TextFieldOperationInterceptor<Grades, String>(finalNote,true);
      FIRST_NAME = new TextFieldOperationInterceptor<Grades, String>(firstName,true);
      TEST4 = new FieldOperationInterceptor<Grades, String>(test4,false);
      TEST2 = new FieldOperationInterceptor<Grades, String>(test2,false);
      TEST1 = new FieldOperationInterceptor<Grades, String>(test1,false);
      GRADE = new TextFieldOperationInterceptor<Grades, String>(grade,true);
      TEST3 = new FieldOperationInterceptor<Grades, String>(test3,false);
    } catch(NoSuchFieldException | SecurityException e) {
      System.err.println(e.getMessage());
    }
  }
}
