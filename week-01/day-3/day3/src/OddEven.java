import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        if (number %2==0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even"
            );
        }

    }
}
