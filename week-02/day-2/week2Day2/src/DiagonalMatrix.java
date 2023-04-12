import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of integer");
        int size = input.nextInt();
        draw(size);
    }

    public static void draw(int size) {
        int[][] number = new int[size][size];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (i == j) {
                    number[i][j] = 1;
                } else {
                    number[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}