public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int result = calculateFactorial(num);
        System.out.println(result);
    }

    public static int calculateFactorial(int x) {
        int sum =1;
        for(int i=1; i<=x; i++){
            sum *=i;
        }
        return sum;
    }
}
