import java.util.Scanner;

public class electricity {

    static int price(int kwh) {
        if (kwh >= 500) {
            return 2500;
        } else if (kwh >= 400 && kwh < 500) {
            return 2000;
        } else if (kwh >= 300 && kwh < 400) {
            return 1500;
        } else if (kwh >= 200 && kwh < 300) {
            return 750;
        } else {
            return 500;
        }
    }

    static int calculateBill(int old, int New) {
        int electricity = New - old;
        int cost = price(electricity);
        return electricity * cost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter old kWh number : ");
        int old = scanner.nextInt();
        System.out.print("Enter new kWh number : ");
        int New = scanner.nextInt();

        int electricity   = New - old;
        int cost = price(electricity);
        int total = calculateBill(old, New);

        System.out.println("Old Number    : " + old + " kWh");
        System.out.println("New Number    : " + New + " kWh");
        System.out.println("Used          : " + electricity + " kWh");
        System.out.println("Unit Price    : " + cost + " Riel/kWh");
        System.out.println("Total Bill    : " + total + " Riel");
    }
} 
    

