import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i <= 4; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            sum = scanner.nextInt();
        }
        double average = sum / 5;
        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
