import java.util.Scanner;
public class DrawDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the pyramid height");
        int neco = input.nextInt();
        draw (neco);
    }
    public static void draw(int height) {
        for (int i = 0; i <= height/2; i=i+1) {
            System.out.println();
            for (int j = 0; j < height / 2 -i; j=j+1) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j= j +1) {
                System.out.print("* ");
            }
        }
        for (int i = 0 ; i <= height/2 -1; i=i+1) {
                System.out.println();
                for (int j = 0; j <=i; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j < height/2-1; j++) {
                    System.out.print("* ");
            }
        }
        System.out.println("Loop finished.");
    }
}
