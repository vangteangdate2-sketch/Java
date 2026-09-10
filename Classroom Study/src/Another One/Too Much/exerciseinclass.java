import java.util.Scanner;

public class exerciseinclass {

    static int Grade(int score) {
        if (score > 90) {return "A";} 
        else if (score > 85) {return "B";} 
        else if (score > 75) {return "C";} 
        else if (score > 60) {return "D";} 
        else if (score >= 50) {return "E";} 
        else {return "F";}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter average score: ");
        int score = scanner.nextInt();

        String grade = Grade(score);

        System.out.println("Average Score = " + score);
        System.out.println("Grade = " + grade);
    }
}