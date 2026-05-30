package month1.week1.day4;

public class Day4Practice4 {


    public static void main(String[] args) {

        int[] scores = {80, 95, 70, 100, 60};
        int lowest = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        System.out.println("Lowest score: " + lowest);

    }
}
