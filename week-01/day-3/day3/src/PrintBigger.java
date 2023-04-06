import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int number1 = input.nextInt();

        System.out.println("Please enter the second number: ");
        int number2 = input.nextInt();

        if (number1 >= number2) {
            System.out.println("The bigger number is: " + number1);
        } else {
            System.out.println("The bigger number is: " + number2);
        }
    }
}
