public class UrlFixer {
    public static void main(String[] args) {
        String bad = "https//www.reddit.com/r/nevertellmethebots";
        String url = change(bad);
        System.out.println(url);
    }

    public static String change(String x) {
        String a =  x.replaceAll("bots", "odds");
        return a;
        }
}

