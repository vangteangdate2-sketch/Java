import java.util.Scanner;
public class homework {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the value of A: ");
            double a = input.nextDouble();
            System.out.println("Enter the value of B: ");
            double b = input.nextDouble();
            System.out.println("Enter the value of C: ");
            double c = input.nextDouble();

            double max=0;
            if(a>c && a>b)
                max = a;
            else if (b>a && b>c)
                max = b;
            else
                max = c;
            System.out.println("Maximum value is "+max);
        }

    }
}
