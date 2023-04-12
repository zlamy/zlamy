import java.util.Arrays;

public class DoubleItems {
    public static void main(String[] args) {
        int [] numbers = {3, 4, 5, 6, 7};

    for (int i= 0; i< numbers.length ; i++){
        numbers[i] = numbers[i]*2;
        }
        System.out.println(Arrays.toString(numbers));
    }
}