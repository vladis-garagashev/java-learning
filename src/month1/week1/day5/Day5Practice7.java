package month1.week1.day5;

import java.util.Scanner;

public class Day5Practice7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int size = scanner.nextInt();

        int[] scores = createScores(scanner, size);

        int total = calculateTotal(scores);
        double average = calculateAverage(total, scores.length);
        int highest = findHighest(scores);
        int lowest = findLowest(scores);

        System.out.println();

        printScores(scores);

        System.out.println();

        System.out.println("Total score: " + total);
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }

    public static int[] createScores(Scanner scanner, int size) {

        int[] scores = new int[size];

        for (int i = 0; i<scores.length; i++) {
            System.out.print("Enter score for player " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        return scores;
    }

    public static void printScores(int[] scores) {
        System.out.println("Player scores: ");

        for (int i = 0; i<scores.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + scores[i]);
        }
    }

    public static int calculateTotal(int[] scores) {
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }

        return total;
    }

    public static double calculateAverage(int total, int count) {
        return (double) total / count;
    }

    public static int findHighest(int[] scores){
        int highest = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (highest < scores[i]) {
                highest = scores[i];
            }
        }

        return highest;
    }

    public static int findLowest(int[] scores) {
        int lowest = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        return lowest;
    }

}
