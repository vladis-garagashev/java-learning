package month1.week1.day4;

public class Day4Final {

    public static void main(String[] args) {

        int[] scores = {80, 95, 70, 100, 60};
        int totalScore = calculateTotal(scores);
        int averageScore = calculateAverage(totalScore, scores.length);
        int highest = findHighest(scores);
        int lowest = findLowest(scores);

        originalScoresTitle();
        printScores(scores);
        System.out.println("");

        System.out.println("Total score: " + totalScore);
        System.out.println("Average score: " + averageScore);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("");

        addBonus(scores);

        updatedScoresTitle();
        printScores(scores);

    }

    static void printScores(int[] scores) {
        for (int score: scores) {
            System.out.println("Player score: " + score);
        }
    }

    static int calculateTotal(int[] scores) {
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }

        return total;
    }

    static int calculateAverage(int total, int count) {
        return total / count;
    }

    static int findHighest(int[] scores) {

        int highest = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }

        return highest;
    }
    static int findLowest(int[] scores) {
        int lowest = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
        return lowest;
    }
    static void addBonus(int[] scores) {

        for (int i = 0; i < scores.length; i++) {
            scores[i] += 10;
        }
    }

    static void originalScoresTitle() {
        System.out.println("Original scores:");
    }
    static void updatedScoresTitle() {
        System.out.println("Updated scores:");
    }


}
