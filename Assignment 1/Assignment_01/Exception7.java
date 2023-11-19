package Assignment_01;
import java.lang.reflect.Field;
public class Exception7 {
    public static void main(String[] args){
    try {
      String obj = new String();
      Class cls = obj.getClass();
      Field fld = cls.getField("No Such Field");
      System.out.println("Field found: " + fld.toString());
    }
    catch (NoSuchFieldException e) {
      System.out.println("Exception: " + e.getMessage());
    }
  }
}
