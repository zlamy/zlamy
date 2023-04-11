public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a+=10;
        System.out.println(a);

        int b = 100;
        b-=7;
        System.out.println(b);

        int c = 44;
        c*=2;
        System.out.println(c);

        int d = 125;
        d/= 5;
        System.out.println(d);

        int e = 8;
        e= e*e*e ;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean isF1Greater = (f1>f2);

        int g1 = 350;
        int g2 = 200;
        if ((2*g2)>g1) {
            System.out.println("f1");
        } else {
            System.out.println("f2");
        }

        int h = 135798745;
        if(h%11==0) {
            System.out.println("true");
        } else {
                System.out.println("not true");
            }

        int i1 = 10;
        int i2 = 3;
        if((i2*i2*i2)> i1 || i1>(i2*i2)) {
            System.out.println("true");
        } else {
            System.out.println("i2 not true");
        }

        int j = 1521;
        if(j%3==0 || j%5==0) {
            System.out.println("true");
        } else {
            System.out.println("not true");
        }


    }
}