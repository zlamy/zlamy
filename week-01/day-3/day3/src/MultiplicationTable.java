import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int x = input.nextInt();
        print(x);
    }
    public static void print(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + number + " = " + (i * number));
        }
    }
}



