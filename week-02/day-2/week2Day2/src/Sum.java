public class Sum {
    public static void main(String[] args) {
        int num = 5;
        int result = sum(num);
        System.out.println(result);
    }

    public static int sum(int x) {
        Integer sum =0;
        for(int i=0; i<=x; i++){
           sum += i;
        }
        return sum;


    }
}
