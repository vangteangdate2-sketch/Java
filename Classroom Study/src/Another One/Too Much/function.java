
public class function {

    public static int sumN(int n) {
        int s = 0;
        for (int i = 1 ; i <= n ; i++ ) {
            s += i;  
        }
        return s; 
    }

    public static void main(String[] args) {
    int result = sumN(5);
    System.out.println("S = " + result);
    }
}