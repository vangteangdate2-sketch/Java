import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int num1 = scanner.nextInt();

        int r = 0;
        int temp1 = num1;

        while (temp1 > 0) {
            int digit = temp1 % 10;     
            r = r * 10 + digit; 
            temp1 = temp1 / 10;         
        }
        System.out.println("Reverse number of " + num1 + " is: " + r);

        System.out.print("\nEnter a number to sum digits: ");
        int num2 = scanner.nextInt();

        int sum = 0;
        int temp2 = num2;

        while (temp2 > 0) {
            int digit = temp2 % 10;   
            sum += digit;            
            temp2 = temp2 / 10;
        }
        System.out.println("Sum of digits of " + num2 + " is: " + sum);
    }
}






