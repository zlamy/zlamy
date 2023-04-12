import java.util.ArrayList;
import java.util.List;

public class listintroduction2 {
    public static void main(String[] args) {
        // Create List A
        List<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        List<String> listB = new ArrayList<>(listA);
        System.out.println(listA.contains("Durian"));
        listB.remove("Durian");
        listA.add(4, "Kiwifruit");
        System.out.println (listA.equals(listB));
        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));
        listB.addAll(List.of("Passion Fruit", "Pomelo"));
        System.out.println(listA.get(2));
        System.out.println(listA);
        System.out.println(listB);








    }
}
