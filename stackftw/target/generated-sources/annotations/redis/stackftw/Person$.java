package redis.stackftw;

import java.lang.NoSuchFieldException;
import java.lang.SecurityException;

public final class Person$ {
  static {
    try {
    } catch(NoSuchFieldException | SecurityException e) {
      System.err.println(e.getMessage());
    }
  }
}
