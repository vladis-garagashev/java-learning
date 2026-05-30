package month1.week1.day6;

import java.util.Scanner;

public class Day6Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = readPlayerCount(scanner);
        System.out.println();

        String[] names = new String[size];
        int[] scores = new int[size];

        readPlayers(scanner, names, scores);

        printPlayers(names, scores);
        System.out.println();

        int total = calculateTotal(scores);
        double average = calculateAverage(total, scores.length);
        System.out.println("Total score: " + total);
        System.out.printf("Average score: %.2f%n", average);
        System.out.println();

        int bestIndex = findBestIndex(scores);
        int lowestIndex = findLowestIndex(scores);

        System.out.println("Top player: " + names[bestIndex] + " with " + scores[bestIndex] + " points");
        System.out.println("Lowest player: " + names[lowestIndex] + " with " + scores[lowestIndex] + " points");
        System.out.println();


        System.out.println("Players above average:");
        printPlayersAboveAverage(names, scores, average);


    }

    public static int readPlayerCount(Scanner scanner) {
        System.out.print("Enter player count: ");
        int size = scanner.nextInt();

        while (size <= 0) {
            System.out.print("Player count must be positive. Try again: ");
            size = scanner.nextInt();
        }
        scanner.nextLine();

        return size;
    }

    public static void readPlayers(Scanner scanner, String[] names, int[] scores) {
        for (int i = 0; i < scores.length; i++){
            System.out.print("Enter name for player " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter score for " + names[i] + ": ");
            int score = scanner.nextInt();
            while (score < 0) {
                System.out.print("Score cannot be negative. Try again: ");
                score = scanner.nextInt();
            }
            scores[i] = score;
            scanner.nextLine();
            System.out.println();

        }


    }


    public static void printPlayers(String[] names, int[] scores) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + scores[i]);
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

    public static int findBestIndex(int[] scores) {
        int bestIndex = 0;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > scores[bestIndex]) {
                bestIndex = i;
            }
        }
        return bestIndex;
    }
    public static int findLowestIndex(int[] scores) {
            int lowestIndex = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[lowestIndex]) {
                lowestIndex = i;
            }
        }
        return lowestIndex;

    }

    public static void printPlayersAboveAverage(String[] names, int[] scores, double average) {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > average) {
                System.out.println(names[i] + ": " + scores[i]);
            }
        }

    }

}
