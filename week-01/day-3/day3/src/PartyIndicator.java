import java.util.Scanner;
public class PartyIndicator {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter the number of girls: ");

        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter the number of boys: ");

        int girlsNumber = input1.nextInt();
        int boysNumber = input2.nextInt();

        if ((girlsNumber == boysNumber) && ((girlsNumber & boysNumber) > 20)) {
            System.out.println("The party is excellent!");
        } else if (((girlsNumber & boysNumber) > 20) && (boysNumber != girlsNumber)) {
            System.out.println("Quite a cool party!");
        } else if ((girlsNumber & boysNumber) < 20) {
            System.out.println("Average party!");
        } else if (girlsNumber==0) {
                System.out.println("Sausage party");
            }
        }






    }
