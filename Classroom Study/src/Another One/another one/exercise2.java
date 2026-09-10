public class exercise2 {
    public static void main(String[] args) {
        double x = 2;

        // a) y = 3x + 5
        double ya = 3 * x + 5;
        System.out.println("a) y = " + ya);

        // b) y = x^2 + 1
        double yb = Math.pow(x, 2) + 1;
        System.out.println("b) y = " + yb);

        // c) 
        double yc = Math.pow(x, 3) + 2 * Math.pow(x, 3) + 6;
        System.out.println("c) y = " + yc);

        // d)
        double yd = 4 * Math.pow(x, 5) + 9;
        System.out.println("d) y = " + yd);

        // e)
        double ye = Math.sqrt(x);
        System.out.println("e) y = " + ye);

        // f) 
        double yf = Math.cbrt(5 * x + 1);
        System.out.println("f) y = " + yf);

        // g)
        double yg = Math.pow(8 * Math.pow(x, 3), 1.0 / 5.0);
        System.out.println("g) y = " + yg);


    }
}