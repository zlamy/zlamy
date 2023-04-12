public class Greeting {

    public static void main(String[] args) {
        int baseNumber = 123 ;
        int doubledNumber = doubleNumber(baseNumber);
        System.out.println(doubledNumber);
    }

    public static int doubleNumber(int a) {
        return a*2;
    }
}