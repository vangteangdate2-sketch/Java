import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        int i = 0;
        while (i < size) {
            System.out.println("Enter number [" + i + "]: ");
            arr[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Your array is:");
        int j = 0;
        while (j < size) {
            System.out.print(arr[j] + "\t");
            j++;
        }
        System.out.println();
    }
} 
    

