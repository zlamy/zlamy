import java.util.Scanner;
public class zkouška {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the pyramid height");
        int height = input.nextInt();
        draw (height);
    }
    public static void draw(int size) {
        for (int i = 0; i < size / 2; i++) {
            for (int j = size; j < size / 2; j--) {
                System.out.println(" ");
            }
            for (int j = size / 2; j < 1; j--) {
                System.out.println("*");
            }
        }
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
        }
    }
    
}
