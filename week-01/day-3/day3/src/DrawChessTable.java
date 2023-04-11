import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the chess table size: ");
        int size = input.nextInt();

        for (int row = 0; row < size; row++) {
            for (int col=0; col < size; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print("% ");
                } else {
                    System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }