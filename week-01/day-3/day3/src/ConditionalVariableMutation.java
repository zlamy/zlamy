import java.util.Scanner;
public class ConditionalVariableMutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        System.out.print("a = ");
        int a = scanner.nextInt();
        int output1 = 0;
        if ((a%2==0)){
            output1++;
            }

        System.out.println("Output #1: " + output1);

        System.out.println("Please enter an integer between 0 and 30: ");
        System.out.print("b = ");
        int b = scanner.nextInt();

        String output2 = "";
        if ((b>10)&&(b<20)){
            output2 = "Sweet!";
        }
        if (b<10){
            output2 = "Less!";
        }
        if (b>20){
            output2 = "MOre!";
        }

        System.out.println("Output #2: " + output2);

        System.out.println("Please enter an integer between 0 and 100: ");
        System.out.print("credits = ");
        int credits = scanner.nextInt();

        System.out.println("Please enter a boolean (true/false): ");
        System.out.print("isBonus = ");
        boolean isBonus = scanner.nextBoolean();

        int output3 = 123;
        if(credits>=50 && isBonus==true){
            output3-=2;
        }
        if(credits>=50 && isBonus==true){
            output3-=1;
        }
        if(isBonus==true){
            output3=output3;
        }
        System.out.println("Output #3: " + output3);

        System.out.println("Please enter an integer between 0 and 50: ");
        System.out.print("d = ");
        int d = scanner.nextInt();

        System.out.println("Please enter an integer between 0 and 500: ");
        System.out.print("time = ");
        int time = scanner.nextInt();

        String output4 = "";
        if((d%4==0)&&(time<=200)){
            output4="Check";
        }
        if(time>200){
            output4="Time out";
        }
        else {
            output4 = "Run Forest Run!";
        }
        System.out.println("Output #4: " + output4);
    }
}