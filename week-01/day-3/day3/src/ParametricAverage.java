import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter");
        int firstNumber = input.nextInt();

        for (int i=1; i<=firstNumber; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number" + i + " of " + firstNumber);
            sum+= scanner.nextInt();
            }
        double average = sum/firstNumber;
        System.out.println("Sum" + sum + ", Average: " + average);



    }
}
