import java.util.Scanner;

public class differ {

    static int number(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        int result = number(n);

        System.out.println("S = 1 + 2 + 3 + ... + " + n + " = " + result);
    }
} 
    

