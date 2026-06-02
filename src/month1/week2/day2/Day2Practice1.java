package month1.week2.day2;

import java.util.Scanner;

public class Day2Practice1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = readPlayerCount(scanner);
        System.out.println();

        String[] names = new String[size];
        int[] scores = new int[size];

        readPlayers(scanner, names, scores);

        int choice = -1;

        while (choice != 0) {
            printMenu();
            choice = readMenuChoice(scanner);
            System.out.println();

            handleMenuChoice(choice, scanner, names, scores);

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
    }

    public static void handleMenuChoice(int choice, Scanner scanner, String[] names, int[] scores) {
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
        }
    }

    public static int readMenuChoice(Scanner scanner) {

        int choice = readInt(scanner, "Choose option: ");

        while (choice < 0 || choice > 6){
            System.out.println("Invalid option. Choose from 0 to 6.");
            choice = readInt(scanner, "Choose option: ");

        }
        return choice;
    }

    public static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();
                return number;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }

    public static int readPlayerCount(Scanner scanner) {
        int size = readInt(scanner, "Enter player count: ");
        while (size <= 0) {
            System.out.println("Player count must be positive. Try again.");
            size = readInt(scanner, "Enter player count: ");
        }

        return size;

    }

    public static void readPlayers(Scanner scanner, String[] names, int[] scores) {
        for (int i = 0; i < scores.length; i++){
            System.out.print("Enter player name: ");
            names[i] = scanner.nextLine();
            scores[i] = readScore(scanner);
            System.out.println();
        }
    }

    public static int readScore(Scanner scanner) {
        int score = readInt(scanner, "Enter score: ");
        while (score < 0) {
            System.out.println("Score cannot be negative. Try again.");
            score = readInt(scanner, "Enter score: ");
        }
        return score;
    }

    public static void printPlayers(String[] names, int[] scores) {
        System.out.println("Players: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + scores[i]);
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

    public static void searchPlayer(Scanner scanner, String[] names, int[] scores) {
        System.out.print("Enter player name: ");
        String searchName = scanner.nextLine();
        int index = findPlayerIndex(names, searchName);
        printSearchResult(names, scores, index);
    }

    public static void printSearchResult(String[] names, int[] scores, int index) {
        if (index == -1) {
            System.out.println("Player not found.");
        } else {
            System.out.println(names[index] + " has score: " + scores[index]);
        }
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
