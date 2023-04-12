public class Colors {
    public static void main(String[] args) {
        java.lang.String[][] colors = {
                {"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"}
        };

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.print(colors[i][j]);
                if (j < colors[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
