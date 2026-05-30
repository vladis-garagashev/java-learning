package month1.week1.day4;

public class Day4Practice6 {

    static int calculateAverage(int[] scores) {
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }

        return total / scores.length;
    }


    public static void main(String[] args) {
        int[] scores = {80, 95, 70, 100, 60};

        int average = calculateAverage(scores);

        System.out.println("Average score: " + average);
    }


}
