public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        quote = repair(quote);
        System.out.println(quote);
    }
    public static String repair(String x) {
        StringBuilder a = new StringBuilder(x);
        int index = a.indexOf("It");
        a.insert(index +2, " always takes longer than");
        return a.toString();

    }
}
