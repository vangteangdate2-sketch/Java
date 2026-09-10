public class arraydimension {
    public static void main(String[] args) {

        String[][] data = {
            {"Android", "90"},
            {"ITP",     "80"},
            {"ULUI",    "75"},
            {"Web",     "60"},
            {"Scisco",  "80"}
        };

        int i = 0;
        while (i < data.length) {
            System.out.println(data[i][0] + " : " + data[i][1]);
            i++;
        }
    }
}