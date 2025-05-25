import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Example 1: Print all numbers from 1 to 10
        System.out.println("Numbers from 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // Example 2: Print a random number between 1 and 5
        System.out.println("\nRandom Number Between 1 and 5:");
        int randomNumber = (int) (Math.random() * 6) + 1;
        System.out.println(randomNumber);
    }
}
