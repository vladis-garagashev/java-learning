package month1.week1.day5;

import java.util.Scanner;

public class Day5Practice4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int size = scanner.nextInt();

        int[] scores = createScores(scanner, size);
        int total = calculateTotal(scores);

        System.out.println();

        printScores(scores);

        System.out.println();

        System.out.println("Total score: " + total);
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

}
