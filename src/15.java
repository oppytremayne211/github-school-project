import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n < 0) {
      System.out.println("Invalid input");
      return;
    }
    for (int i = 1; i <= n; i++) {
      System.out.println(i);
    }
  }
}
