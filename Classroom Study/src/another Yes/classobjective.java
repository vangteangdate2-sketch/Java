import java.util.Scanner;

public class classobjective {
    
    public class Point {
        int x;
        int y;

        void input() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter x of Point: ");
            x = in.nextInt();
            System.out.print("Enter y of Point: ");
            y = in.nextInt();
        }

        void output() {
            System.out.println("P("+ x +","+ y +"): ");
        }
    }
        public static void main(String[] args) {
        classobjective outer = new classobjective();
        Point p = outer.new Point();
        p.input();
        p.output();
        }
    
}
