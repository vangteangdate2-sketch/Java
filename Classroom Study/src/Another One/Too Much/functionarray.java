import java.util.Scanner;

public class functionarray {

    static Scanner scanner = new Scanner(System.in);

    static int[] intArray() {
        System.out.println("How many numebr do you want to enter? ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        int i = 0;
        while (i < size) {
            System.out.println("Enter Number [" + i + "]: ");
            arr[i] = scanner.nextInt();
            i++;
        }
    return arr;
    }

    static void outputarray(int[] arr) {
        System.out.println("Your Array Number is ");
        int i = 0;
        while ( i < arr.length) {
            System.out.print(arr[i] + "\t");
            i++;
        }
    

    public static void main(String[] args) {
        int[] myArray = intArray();  
        outputArray(Array);    
    }
    }
}
