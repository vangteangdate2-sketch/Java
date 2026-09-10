public class Exercise {
    public static void main(String[] args) {
        System.out.println("                                      Multiplication Table");

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9 ; j++) {
            System.out.print(j + " x " + i + " = " + (i * j) + "\t");
            }
        System.out.println();
        }
    }    
}
