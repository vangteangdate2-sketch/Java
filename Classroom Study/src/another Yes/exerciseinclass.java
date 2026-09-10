public class exerciseinclass {

    static float[] scores = {70,60,(float) 80.5,50,90};

    static float totalScore(float[] scores) {
        float total = 0;
        int i = 0;
        while (i < scores.length) {
            total += scores[i];
            i++;
        }
        return total;
    }

    static float averageScore(float[] scores) {
        return totalScore(scores) / scores.length;
    }

    static String getGrade(float average) {
        if (average >= 85) {
            return "A";
        } else if (average >= 80 && average < 85) {
            return "B";
        } else if (average >= 70 && average < 80) {
            return "C";
        } else if (average >= 60 && average < 70) {
            return "D";
        } else if (average >= 50 && average < 60) {
            return "E";
        } else {
            return "F";
        }
    }
        public static void main(String[] args) {
            float total = totalScore(scores);
            float average = averageScore(scores);
            String grade = getGrade(average);

            System.out.print("Scores        : " );
            int i = 0;
            while (i < scores.length) {
                System.out.print(scores[i] + " ");
                i++;
            }

            System.out.println();
            System.out.println("Total         : " + total);
            System.out.println("Total Average : " + average);
            System.out.println("Grade         : " + grade);

        }
        
    }

