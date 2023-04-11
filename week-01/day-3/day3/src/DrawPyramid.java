import java.util.Scanner;
public class DrawPyramid {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Please enter the pyramid height");
        int height = input.nextInt();
        draw (height);
    }
        public static void draw(int height) {
            for (int i = 0; i <= height; i++) {
                System.out.println();
                for (int j =height+2; j >= i; j--) {
                    System.out.print("j");
                }
                for (int j = 8; j <= i+9; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println("Loop finished.");
        }
    }
