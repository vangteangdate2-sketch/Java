import java.util.Scanner;
public class homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the limit value for n: ");
        int n = scanner.nextInt();

        // a)
        System.out.print("a) ");
        int i = 1;
        while (i <= n) {
            System.out.print((2 * i - 1) + " ");
            i++;
        }
            System.out.println();

        // b)
        System.out.print("b) ");
        int b = 1;
        while (b <= n) {
            System.out.print(b + " ");
            b++;
        }
        System.out.println();

        // c)
        System.out.print("c) ");
        int c = 1;
        while (c <= n) {
            System.out.print((int) Math.pow(c, 2) + " ");
            c++;
        }
        System.out.println();

        // d)
        System.out.print("d) ");
        int d = 1;
        while (d <= n) {
            System.out.print((int) Math.pow(d, d) + " ");
            d++;
        }
        System.out.println();

        // e)
        System.out.print("e) ");
        int e = 1;
        while (e <= n) {
            if (e % 2 == 0) {
                System.out.print("-1/" + e + " ");
            } else {
                System.out.print("1/" + e + " ");
            }
            e++;
        }
        System.out.println();



    }
}
