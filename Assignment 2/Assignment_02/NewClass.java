package Assignment_02;
public class NewClass {
    public static void main(String[] args) {
    try {
      int result = divide(58, 0);
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
  public static int divide(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException
        ("Can't be divided by zero!");
    }
    return a / b;
  }
}
