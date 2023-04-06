public class Cuboid {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        a = 10.4;
        b = 13.5;
        c = 8.2;
        double surface = 2*(a*b + b*c + a*c);
        System.out.println("Surface Area: " + surface);
        double Volume = a*b*c;
        System.out.println("Surface Area: " + Volume);

    }
}
