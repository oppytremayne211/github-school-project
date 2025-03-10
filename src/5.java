import java.util.Scanner;
public class MyFirstJavaProgram {
   public static void main(String[] args) {
      System.out.println("Hello, World!"); // Display the string.
      int age = 30; // Declare and initialize a variable.
      if (age < 18) { // Check the condition.
         System.out.println("You are not eligible."); // Display the message.
      } else {
         System.out.println("You are eligible to vote."); // Display the message.
      }
      Scanner input = new Scanner(System.in); // Declare a Scanner object.
      System.out.print("Enter your name: "); // Prompt the user to enter their name.
      String name = input.nextLine(); // Read the user's input.
      System.out.println("Hello, " + name + "!"); // Display the greeting message.
   }
}
