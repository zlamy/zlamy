public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        todoText = change(todoText);
        System.out.println(todoText);
    }
    public static String change (String x){
        StringBuilder a = new StringBuilder(x);
        a.insert(0, "My todo:\n");
        a.append(" - Download games\n");
        a.append("     - Diablo");
        return a.toString();
    }
}
