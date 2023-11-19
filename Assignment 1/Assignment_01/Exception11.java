package Assignment_01;
public class Exception11 {
    public void testRuntimeException () {
      throw new MyException();
   }
   public static void main(String[] args) {
       new Exception11().testRuntimeException();
   }
class MyException extends RuntimeException {
   public MyException() {
      super();
   }
}
}