import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number you want to see: ");
        int i = scanner.nextInt();
        System.out.println("Enter the limit value for n: ");
        int n = scanner.nextInt();

        while (i<=n) {
            System.out.print(i + " Fish and Chip " + "\t");
            i+= 1*2;
        }
    
    }
}
