public class CompareLength {
    public static void main(String[] args) {
        int [] firstArrayOfNumbers = {4, 5, 6, 7};
        int [] secondArrayOfNumbers = {4, 5};

        if (secondArrayOfNumbers.length >firstArrayOfNumbers.length ) {
            System.out.println("secondArrayOfNumbers is longer");
        } else {
            System.out.println("firstArrayOfNumbers is the longer one");

        }
    }
}

