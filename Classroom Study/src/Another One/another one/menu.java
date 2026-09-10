import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("""
                    *** Menu *** \n** 1. Addition (+) ** \n** 2. Substraction (-) ** \n** 3. Multiplication ** \n** 4. Dvision (/) **
                    """);
            
            System.out.println("Enter the value1: ");
            double value1 = scanner.nextDouble();
            System.out.println("Enter the value2: ");
            double value2 = scanner.nextDouble();

            System.out.println("Please choose sign operator (+ - * /)");
            String operator = scanner.next();

            double result = 0;
            
            switch (operator) {
                case "+":
                    result = value1 + value2;
                    System.out.println("The Result: " + result);
                    break;
                case "-":
                    result = value1 - value2;
                    System.out.println("The Result: " + result);
                    break;
                case "*":
                    result = value1 * value2;
                    System.out.println("The Result: " + result);
                    break;
                case "/":
                    result = value1 / value2;
                    System.out.println("The Result: " + result);
                    break;
                default:
                    System.out.println("Invalid Operator!");
            }
        } 
    }
}
