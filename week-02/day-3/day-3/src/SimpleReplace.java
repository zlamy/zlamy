public class SimpleReplace {
    public static void main(String[] args) {
        String example = "In a dishwasher far, far away";
        example = buildAstring(example);
        System.out.println(example);
    }
    public static String buildAstring(String x) {
        StringBuilder a = new StringBuilder(x);
        a.replace(5,15,"Galaxy" );
        return a.toString();
        }
}