import java.util.Scanner;
public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = input.nextDouble();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();
        double area = width * height;
        
        System.out.println("Area of the Rectangle is " + area);
        input.close();
    }
}