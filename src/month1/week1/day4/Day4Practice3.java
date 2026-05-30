package month1.week1.day4;

public class Day4Practice3 {

    public static void main(String[] args) {
        int[] scores = {80, 95, 70, 100, 60};
        int highest = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }

        System.out.println("Highest score: " + highest);

    }

}
