import java.util.Scanner;
public class nested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter the Number of Symbol: ");
        String symbol = scanner.next();
        System.out.println("Enter the Number of Row: ");
        int row = scanner.nextInt();

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(symbol + " ");
            System.out.println();
        }
    }
}
