import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the triangle height");
        int height = input.nextInt();
        draw(height);
    }

    public static void draw(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }
        System.out.println("Loop finished.");
    }
}





