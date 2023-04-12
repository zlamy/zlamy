import java.util.ArrayList;

public class Listintroduction1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.toArray().length);
        names.add("William");
        System.out.println(names.isEmpty());
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        for (String name : names){
            System.out.println(name);
        }

        for (int i= 0;i<names.size();i++){
            String name = names.get(i);
            System.out.println( (i+1) + ". " +name);
        }
        names.remove(1);
        for (String name : names){
            System.out.println(name);
        }
        names.clear();
        System.out.println(names.size());













    }
}
