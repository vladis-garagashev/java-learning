package month1.week1.day7;

import java.util.Scanner;

// Player Score Menu Analyzer
public class Day7Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Alex", "Bob", "John"};
        int[] scores = {80, 95, 70};
        int choice = -1;

        while (choice != 0) {
            printMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            if (choice == 1) {
                printPlayers(names, scores);
            } else if (choice == 2) {
                searchPlayer(scanner, names, scores);
            } else if (choice == 3) {
                printBestPlayer(names, scores);
            } else if (choice == 4) {
                printAverageScore(scores);
            } else if (choice == 5) {
                printLowestPlayer(names, scores);
            } else if (choice == 6) {
                printPlayersAboveAverage(names, scores);
            } else if (choice == 0) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid option.");
            }
            System.out.println();
        }
    }

    public static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Print all players");
        System.out.println("2. Search player by name");
        System.out.println("3. Show best player");
        System.out.println("4. Show average score");
        System.out.println("5. Show lowest player");
        System.out.println("6. Show players above average");
        System.out.println("0. Exit");
        System.out.print("Choose option: ");
    }

    public static void printPlayers(String[] names, int[] scores) {
        System.out.println("Players: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + scores[i]);
        }
    }

    public static int findPlayerIndex(String[] names, String searchName) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                return i;
            }
        }
        return -1;
    }

    public static void printSearchResult(String[] names, int[] scores, int index) {
        if (index == -1) {
            System.out.println("Player not found.");
        } else {
            System.out.println(names[index] + " has score: " + scores[index]);
        }
    }

    public static void searchPlayer(Scanner scanner, String[] names, int[] scores) {
        System.out.print("Enter player name: ");
        String searchName = scanner.nextLine();
        int index = findPlayerIndex(names, searchName);
        printSearchResult(names, scores, index);
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


    public static void printBestPlayer(String[] names, int[] scores) {
        int bestIndex = findBestIndex(scores);
        System.out.println("Best player: " + names[bestIndex] + " with score " + scores[bestIndex]);
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

    public static void printAverageScore(int[] scores) {
        int total = calculateTotal(scores);
        double average = calculateAverage(total, scores.length);
        System.out.printf("Average score: %.2f%n", average);
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

    public static void printLowestPlayer(String[] names, int[] scores) {
        int lowestIndex = findLowestIndex(scores);
        System.out.println("Lowest player: " + names[lowestIndex] + " with score " + scores[lowestIndex]);
    }

    public static void printPlayersAboveAverage(String[] names, int[] scores) {
        int total = calculateTotal(scores);
        double average = calculateAverage(total, scores.length);
        System.out.println("Players above average:");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > average) {
                System.out.println(names[i] + ": " + scores[i]);
            }
        }

    }

}
