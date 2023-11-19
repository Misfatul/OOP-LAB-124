package Assignment_02;
public class NewClass1 {
    public static void main(String[] args) {
    int n = 2;
    check(n);
    n = 7;
    check(n);
    n = 9;
    check(n);
  }

  public static void check(int n) {
    try {
      Even(n);
      System.out.println(n + " is even.");
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void Even(int n) {
    if (n % 2 != 0) {
      throw new IllegalArgumentException(n + " is odd.");
    }
  }
}
