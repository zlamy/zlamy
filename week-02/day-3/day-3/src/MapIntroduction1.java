import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {
        HashMap<Integer, Character> a = new HashMap<>();
        System.out.println(a.isEmpty());
        a.put(97, 'a');
        a.put(98, 'b');
        a.put(99, 'c');
        a.put(65, 'A');
        a.put(66, 'B');
        a.put(67, 'C');

        System.out.println(a.keySet());
        System.out.println(a.values());
        a.put(68, 'D');
        System.out.println(a.size());
        System.out.println(a.get(99));
        a.remove(97);
        System.out.println(a.containsKey(100));
        System.out.println(a.size());




    }

}
