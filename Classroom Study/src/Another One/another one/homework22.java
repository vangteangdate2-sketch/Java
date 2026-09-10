import java.util.Scanner;
public class homework22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total expense: $");
        double expense = scanner.nextDouble();

        double discount = 0;
        double discountPercent = 0;

        if (expense >= 300) {
            discountPercent = 20;
        } else if (expense > 200 && expense < 300) {
            discountPercent = 15;
        } else if (expense >= 100 && expense <= 200) {
            discountPercent = 10;
        } else {
            discountPercent = 5;
        }

        discount = expense * (discountPercent / 100);
        double total = expense - discount;

        System.out.println("----------------------------");
        System.out.println("Expense        : $" + String.format("%.2f", expense));
        System.out.println("Discount (" + (int)discountPercent + "%)  : $" + String.format("%.2f", discount));
        System.out.println("Total to pay   : $" + String.format("%.2f", total));
        System.out.println("----------------------------");
    }
}

