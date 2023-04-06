import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int first = input.nextInt();

        System.out.println("Please enter the second number: ");
        int second = input.nextInt();

        if (second<=first){
            System.out.println("The second number should be bigger");
        } else {
            for (int i=first; i<=second; i++){
                System.out.println(i);
            }
        }
    }
}
