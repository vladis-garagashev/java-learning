package month1.week2.day4;

import java.util.Scanner;

public class Day4Practice1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = readPlayerCount(scanner);
        System.out.println();

        String[] names = new String[size];
        int[] scores = new int[size];
        boolean[] active = new boolean[size];

        readPlayers(scanner, names, scores, active);

        int choice = -1;

        while (choice != 0) {
            printMenu();
            choice = readMenuChoice(scanner);
            System.out.println();

            handleMenuChoice(choice, scanner, names, scores, active);

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
        System.out.println("7. Update player score");
        System.out.println("8. Reset player score");
        System.out.println("9. Mark player as inactive");
        System.out.println("0. Exit");
    }

    public static void handleMenuChoice(int choice, Scanner scanner, String[] names, int[] scores, boolean[] active) {
        if (choice == 1) {
            printPlayers(names, scores, active);
        } else if (choice == 2) {
            searchPlayer(scanner, names, scores, active);
        } else if (choice == 3) {
            printBestPlayer(names, scores, active);
        } else if (choice == 4) {
            printAverageScore(scores, active);
        } else if (choice == 5) {
            printLowestPlayer(names, scores, active);
        } else if (choice == 6) {
            printPlayersAboveAverage(names, scores, active);
        } else if (choice == 7) {
            updatePlayerScore(scanner, names, scores, active);
        } else if (choice == 8) {
            resetPlayerScore(scanner, names, scores, active);
        } else if (choice == 9) {
            markPlayerInactive(scanner, names, active);
        } else if (choice == 0) {
            System.out.println("Goodbye!");
        }
    }

    public static int readMenuChoice(Scanner scanner) {

        int choice = readInt(scanner, "Choose option: ");

        while (choice < 0 || choice > 9){
            System.out.println("Invalid option. Choose from 0 to 9.");
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

    public static void readPlayers(Scanner scanner, String[] names, int[] scores, boolean[] active) {
        for (int i = 0; i < scores.length; i++){
            System.out.print("Enter player name: ");
            names[i] = scanner.nextLine();
            scores[i] = readScore(scanner, "Enter score: ");
            active[i] = true;
            System.out.println();
        }
    }

    public static int readScore(Scanner scanner, String prompt) {
        int score = readInt(scanner, prompt);
        while (score < 0) {
            System.out.println("Score cannot be negative. Try again.");
            score = readInt(scanner, prompt);
        }
        return score;
    }

    public static void printPlayers(String[] names, int[] scores, boolean[] active) {
        System.out.println("Players: ");
        for (int i = 0; i < names.length; i++) {
            if (active[i]) {
                System.out.println(names[i] + " - " + scores[i]);
            }
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

    public static void searchPlayer(Scanner scanner, String[] names, int[] scores, boolean[] active) {
        System.out.print("Enter player name: ");
        String searchName = scanner.nextLine();
        int index = findPlayerIndex(names, searchName);
        printSearchResult(names, scores, active, index);
    }

    public static void printSearchResult(String[] names, int[] scores, boolean[] active, int index) {
        if (index == -1) {
            System.out.println("Player not found.");
        } else {
            if (!active[index]) {
                System.out.println("Player " + names[index] + " is inactive.");
            } else {
                System.out.println(names[index] + " has score: " + scores[index]);
            }
        }
    }

    public static void updatePlayerScore(Scanner scanner, String[] names, int[] scores, boolean[] active) {
        System.out.print("Enter player name: ");
        String searchName = scanner.nextLine();
        int index = findPlayerIndex(names, searchName);
        if (index == -1) {
            System.out.println("Player not found.");
        } else if (!active[index]){
            System.out.println("Player is inactive.");
        } else {
            int oldScore = scores[index];
            System.out.println("Current score: " + scores[index]);
            int newScore = readScore(scanner, "Enter new score: ");
            scores[index] = newScore;
            System.out.println("Score updated successfully.");
            System.out.println("Old score: " + oldScore);
            System.out.println("New score: " + scores[index]);
        }

    }

    public static void resetPlayerScore(Scanner scanner, String[] names, int[] scores, boolean[] active) {
        System.out.print("Enter player name to reset: ");
        String searchName = scanner.nextLine();
        int index = findPlayerIndex(names, searchName);
        if (index == -1) {
            System.out.println("Player not found.");
        } else if (!active[index]) {
            System.out.println("Player is inactive.");
        } else {
            int oldScore = scores[index];
            System.out.println("Current score: " + scores[index]);
            int newScore = 0;
            scores[index] = newScore;
            System.out.println("Score reset successfully.");
            System.out.println("Old score: " + oldScore);
            System.out.println("New score: " + newScore);
        }
    }

    public static void markPlayerInactive(Scanner scanner, String[] names, boolean[] active) {
        System.out.print("Enter player name to mark inactive: ");
        String searchName = scanner.nextLine();
        int index = findPlayerIndex(names, searchName);
        if (index == -1) {
            System.out.println("Player not found.");
        } else {
            active[index] = false;
            System.out.println(names[index] + " is now inactive.");
        }
    }

    public static int findBestIndex(int[] scores, boolean[] active) {
        int bestIndex = -1;

        for (int i = 0; i < scores.length; i++) {
            if (!active[i]) {
                continue;
            }
            if (bestIndex == -1) {
                bestIndex = i;
            } else if (scores[i] > scores[bestIndex]) {
                bestIndex = i;
            }
        }
        return bestIndex;
    }

    public static void printBestPlayer(String[] names, int[] scores, boolean[] active) {
        int bestIndex = findBestIndex(scores, active);
        if (bestIndex == -1) {
            System.out.println("No active players.");
        }
        else {
            System.out.println("Best player: " + names[bestIndex] + " with score " + scores[bestIndex]);
        }
    }

    public static int calculateTotal(int[] scores, boolean[] active) {
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            if (active[i]) {
                total += scores[i];
            }
        }
        return total;
    }

    public static int countActivePlayers(boolean[] active) {
        int count = 0;

        for (int i = 0; i < active.length; i++) {
            if (active[i]) {
                count++;
            }
        }
        return count;
    }

    public static double calculateAverage(int total, int count) {
        return (double) total / count;
    }

    public static void printAverageScore(int[] scores, boolean[] active) {
        int total = calculateTotal(scores, active);
        int count = countActivePlayers(active);

        if (count == 0) {
            System.out.println("No active players.");
        }
        else {
            double average = calculateAverage(total, count);
            System.out.printf("Average score: %.2f%n", average);
        }
    }

    public static int findLowestIndex(int[] scores, boolean[] active) {
        int lowestIndex = -1;

        for (int i = 0; i < scores.length; i++) {
            if (!active[i]) {
                continue;
            }
            if (lowestIndex == -1) {
                lowestIndex = i;
            } else if (scores[i] < scores[lowestIndex]) {
                lowestIndex = i;
            }
        }
        return lowestIndex;

    }

    public static void printLowestPlayer(String[] names, int[] scores, boolean[] active) {
        int lowestIndex = findLowestIndex(scores, active);
        if (lowestIndex == -1) {
            System.out.println("No active players.");
        }
        else {
            System.out.println("Lowest player: " + names[lowestIndex] + " with score " + scores[lowestIndex]);
        }
    }

    public static void printPlayersAboveAverage(String[] names, int[] scores, boolean[] active) {
        int total = calculateTotal(scores,active);
        int count = countActivePlayers(active);

        if (count == 0) {
            System.out.println("No active players.");
        } else {
            double average = calculateAverage(total, count);
            System.out.println("Players above average:");
            for (int i = 0; i < scores.length; i++) {
                if (!active[i]) {
                    continue;
                }
                if (scores[i] > average) {
                    System.out.println(names[i] + ": " + scores[i]);
                }
            }

        }

    }

}
