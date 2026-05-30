package month1.week1.day4;

public class Day4Practice10 {

    static void addBonus(int[] scores) {

        for (int i = 0; i < scores.length; i++) {
            scores[i] += 10;
        }
    }

    public static void main(String[] args) {

        int[] scores = {80, 95, 70, 100, 60};

        addBonus(scores);
        for (int score : scores) {

            System.out.println("Updated score: " + score);
        }

    }

}
