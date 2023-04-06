import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of chickens: ");
        int numChicks = input.nextInt();

        System.out.println("Please enter the number of pigs: ");
        int numPigs = input.nextInt();

        int tottalLegs = numChicks * 2 + numPigs * 4;
        System.out.println("The number of legs: " + tottalLegs);






    }
}
