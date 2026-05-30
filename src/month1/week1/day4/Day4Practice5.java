package month1.week1.day4;

public class Day4Practice5 {


    static int calculateTotal(int[] scores) {
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int[] scores = {80, 95, 70, 100, 60};

        int total = calculateTotal(scores);
        System.out.println("Total score: " + total);

    }
}
