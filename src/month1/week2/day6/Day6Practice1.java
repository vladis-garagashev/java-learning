package month1.week2.day6;

import java.util.ArrayList;
import java.util.Scanner;

public class Day6Practice1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();

        addPlayer(names, scores, "Alex", 80);
        addPlayer(names, scores, "Bob", 95);
        addPlayer(names, scores, "John", 70);

        int choice = -1;

        while (choice != 0) {
            printMenu();
            choice = readMenuChoice(scanner);
            System.out.println();

            handleMenuChoice(choice, names, scores, scanner);

            System.out.println();
        }
    }

    public static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Print all players");
        System.out.println("2. Search player by name");
        System.out.println("3. Show best player");
        System.out.println("4. Show lowest player");
        System.out.println("5. Show average score");
        System.out.println("6. Show players above average");
        System.out.println("7. Add new player");
        System.out.println("8. Update player score");
        System.out.println("9. Remove player");
        System.out.println("0. Exit");
    }

    public static void handleMenuChoice(int choice, ArrayList<String> names, ArrayList<Integer> scores, Scanner scanner) {
        if (choice == 1) {
            printPlayers(names, scores);
        } else if (choice == 2) {
            searchPlayer(scanner, names, scores);
        } else if (choice == 3) {
            printBestPlayer(names, scores);
        } else if (choice == 4) {
            printLowestPlayer(names, scores);
        } else if (choice == 5) {
            printAverageScore(scores);
        } else if (choice == 6) {
            printPlayersAboveAverage(names, scores);
        } else if (choice == 7) {
            addNewPlayer(scanner, names, scores);
        } else if (choice == 8) {
            updatePlayerScore(scanner, names, scores);
        } else if (choice == 9) {
            removePlayer(scanner, names, scores);
        } else if (choice == 0) {
            System.out.println("Goodbye!");
        }
    }

    public static int readMenuChoice(Scanner scanner) {

        int choice = readInt(scanner, "Choose option: ");

        while (choice < 0 || choice > 9){
            System.out.println("Invalid option.");
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

    public static void printPlayers(ArrayList<String> names, ArrayList<Integer> scores) {
        System.out.println("Players:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " - " + scores.get(i));
        }
    }

    public static void addPlayer(ArrayList<String> names, ArrayList<Integer> scores, String name, int score) {
        names.add(name);
        scores.add(score);
    }

    public static void addNewPlayer(Scanner scanner, ArrayList<String> names, ArrayList<Integer> scores) {
        System.out.print("Enter player name: ");
        String name = (scanner.nextLine());
        int score = readScore(scanner, "Enter score: ");
        addPlayer(names, scores, name, score);
        System.out.println("Player added.");
    }

    public static int readScore(Scanner scanner, String prompt) {
        int score = readInt(scanner, prompt);
        while (score < 0) {
            System.out.println("Score cannot be negative. Try again.");
            score = readInt(scanner, prompt);
        }
        return score;
    }

    public static void updateScore(ArrayList<Integer> scores, int index, int newScore){
        scores.set(index, newScore);
    }

    public static void updatePlayerScore(Scanner scanner, ArrayList<String> names, ArrayList<Integer> scores) {
        System.out.print("Enter player name: ");
        String searchName = scanner.nextLine();
        int index = findPlayerIndex(names, searchName);
        if (index == -1) {
            System.out.println("Player not found.");
        } else {
            int currentScore = scores.get(index);
            System.out.println("Current score: " + currentScore);
            int newScore = readScore(scanner, "Enter new score: ");
            updateScore(scores, index, newScore);
            System.out.println("Player score updated.");
        }

    }

    public static void removePlayer(Scanner scanner, ArrayList<String> names, ArrayList<Integer> scores){
        System.out.print("Enter player name: ");
        String searchName = scanner.nextLine();
        int index = findPlayerIndex(names, searchName);
        if (index == -1) {
            System.out.println("Player not found.");
        } else {
            names.remove(index);
            scores.remove(index);
            System.out.println("Player removed.");
        }

    }

    public static int findPlayerIndex(ArrayList<String> names, String searchName) {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase(searchName)) {
                return i;
            }
        }
        return -1;
    }

    public static void searchPlayer(Scanner scanner, ArrayList<String> names, ArrayList<Integer> scores) {
        System.out.print("Enter player name: ");
        String searchName = scanner.nextLine();
        int index = findPlayerIndex(names, searchName);
        printSearchResult(names, scores, index);
    }

    public static void printSearchResult(ArrayList<String> names, ArrayList<Integer> scores, int index) {
        if (index == -1) {
            System.out.println("Player not found.");
        } else {
            System.out.println(names.get(index) + " - " + scores.get(index));
        }
    }

    public static int findBestIndex(ArrayList<Integer> scores) {
        int bestIndex = 0;

        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > scores.get(bestIndex)) {
                bestIndex = i;
            }
        }

        return bestIndex;
    }

    public static void printBestPlayer(ArrayList<String> names, ArrayList<Integer> scores) {
        int bestIndex = findBestIndex(scores);
        System.out.println("Best player:");
        System.out.println(names.get(bestIndex) + " - " + scores.get(bestIndex));
    }

    public static int findLowestIndex(ArrayList<Integer> scores) {
        int lowestIndex = 0;

        for (int i = 0; i < scores.size(); i++) {

            if (scores.get(i) < scores.get(lowestIndex)) {
                lowestIndex = i;
            }
        }
        return lowestIndex;

    }

    public static void printLowestPlayer(ArrayList<String> names, ArrayList<Integer> scores) {
        int lowestIndex = findLowestIndex(scores);
        System.out.println("Lowest player:");
        System.out.println(names.get(lowestIndex) + " - " + scores.get(lowestIndex));
    }

    public static int calculateTotal(ArrayList<Integer> scores) {
        int total = 0;

        for (int i = 0; i < scores.size(); i++) {
            total += scores.get(i);
        }
        return total;
    }

    public static double calculateAverage(int total, int count) {
        return (double) total / count;
    }

    public static void printAverageScore(ArrayList<Integer> scores) {
        int total = calculateTotal(scores);
        double average = calculateAverage(total, scores.size());
        System.out.printf("Average score: %.2f%n", average);
    }

    public static void printPlayersAboveAverage(ArrayList<String> names, ArrayList<Integer> scores) {
        int total = calculateTotal(scores);

        double average = calculateAverage(total, scores.size());
        System.out.println("Players above average:");
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > average) {
                System.out.println(names.get(i) + " - " + scores.get(i));
            }
        }

    }

}
