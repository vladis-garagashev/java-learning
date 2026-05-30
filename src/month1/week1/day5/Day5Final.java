package month1.week1.day5;

import java.util.Scanner;

public class Day5Final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = readPlayerCount(scanner);

        int[] scores = createScores(scanner, size);

        int total = calculateTotal(scores);
        double average = calculateAverage(total, scores.length);
        int highest = findHighest(scores);
        int lowest = findLowest(scores);
        int aboveAverage = countAboveAverage(scores, average);

        System.out.println();

        printScores(scores);

        System.out.println();

        System.out.println("Total score: " + total);
        System.out.printf("Average score: %.2f%n", average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Players above average: " + aboveAverage);

    }

    public static int readPlayerCount(Scanner scanner) {
        System.out.print("Enter number of players: ");
        int size = scanner.nextInt();

        while (size <= 0) {
            System.out.print("Number of players must be greater than 0. Try again: ");
            size = scanner.nextInt();
        }

        return size;
    }


    public static int[] createScores(Scanner scanner, int size) {
        int[] scores = new int[size];

        for (int i = 0; i < scores.length; i++){
            scores[i] = readScore(scanner, i + 1);
        }

        return scores;

    }

    public static int readScore(Scanner scanner, int playerNumber) {
        System.out.print("Enter score for player " + playerNumber + ": ");
        int score = scanner.nextInt();

        while (score < 0) {
            System.out.print("Score cannot be negative. Try again: ");
            score = scanner.nextInt();
        }

        return score;
    }

    public static void printScores(int[] scores){
        System.out.println("Player scores: ");
        for (int i = 0; i < scores.length; i++) {
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

    public static int findHighest(int[] scores) {
        int hhighest = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (hhighest < scores[i]) {
                hhighest = scores[i];
            }
        }
        return hhighest;
    }

    public static int findLowest(int[] scores) {
        int lowest = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (lowest > scores[i]) {
                lowest = scores[i];
            }
        }
        return lowest;
    }

    public static int countAboveAverage(int[] scores, double average) {
        int count = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > average) {
                count++;
            }
        }
        return count;
    }





}
