import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the square size: ");
        int number = input.nextInt();
        draw(number);
    }

        public static void draw(int size) {
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    if (i == 1 || i == size || j == 1 || j == size) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
