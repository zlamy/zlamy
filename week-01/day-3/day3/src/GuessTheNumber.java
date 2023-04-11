import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int storedNumber = 8;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your guess:"
        );
        int guess = input.nextInt();

        while (guess != storedNumber) {
            if (guess < storedNumber) {
                System.out.println("The stored number is greater than " + guess);
            } else {
                System.out.println("The stored number is smaller than " + guess);
            }
            System.out.print("Please enter your guess: ");
            guess = input.nextInt();
        }
        System.out.println("You have found the stored number " + storedNumber);
    }
}


