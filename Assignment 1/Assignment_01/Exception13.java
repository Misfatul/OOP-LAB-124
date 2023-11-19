package Assignment_01;
public class Exception13 {
    public static void main(String[] args) {
    int n = 27;
    check(n);
  }
 public static void check(int n) {
    try {
      Even(n);
      System.out.println(n + " is even.");
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
  public static void Even(int n) {
    if (n % 2 != 0) {
      throw new IllegalArgumentException("Illegal Argument Exception");
    }
  }
}
