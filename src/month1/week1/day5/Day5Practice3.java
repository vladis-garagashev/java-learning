package month1.week1.day5;

import java.util.Scanner;

public class Day5Practice3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int size = scanner.nextInt();

        int[] scores = createScores(scanner, size);

        printScores(scores);
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
}
