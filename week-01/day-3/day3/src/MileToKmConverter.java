import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a distance in miles");
        double distance = input.nextDouble();
        double convert = distance * 1.609344;
        System.out.println("The distance in km is:" + convert + "!");
    }
}