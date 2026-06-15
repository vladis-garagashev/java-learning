package month1.week4.day1;

import java.util.Scanner;

public class Day1Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlayerManager manager = new PlayerManager();

        int choice = -1;

        while (choice != 0) {
            printMenu();
            choice = readMenuChoice(scanner);
            System.out.println();

            handleMenuChoice(choice, scanner, manager);

            System.out.println();
        }
    }

    public static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Print all players");
        System.out.println("2. Add player");
        System.out.println("3. Search player by name");
        System.out.println("4. Update player score");
        System.out.println("5. Remove player");
        System.out.println("6. Show best player");
        System.out.println("7. Show lowest player");
        System.out.println("8. Show average score");
        System.out.println("9. Show players above average");
        System.out.println("10. Show final report");
        System.out.println("0. Exit");
    }
    public static int readMenuChoice(Scanner scanner) {

        int choice = readInt(scanner, "Choose option: ");

        while (choice < 0 || choice > 10){
            System.out.println("Invalid option. Choose from 0 to 10.");
            choice = readInt(scanner, "Choose option: ");

        }
        return choice;
    }
    public static void handleMenuChoice(int choice, Scanner scanner, PlayerManager manager) {
        switch (choice) {
            case 1 -> manager.printPlayers();
            case 2 -> handleAddPlayer(scanner, manager);
            case 3 -> handleSearchPlayer(scanner, manager);
            case 4 -> handleUpdatePlayerScore(scanner, manager);
            case 5 -> handleRemovePlayer(scanner, manager);
            case 6 -> manager.printBestPlayer();
            case 7 -> manager.printLowestPlayer();
            case 8 -> manager.printAverageScore();
            case 9 -> manager.printPlayersAboveAverage();
            case 10 -> manager.printFinalReport();
            case 0 -> System.out.println("Goodbye!");
        }
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
    public static String readPlayerName(Scanner scanner) {
        System.out.print("Enter player name: ");
        String name = scanner.nextLine();
        return name;
    }
    public static int readPlayerScore(Scanner scanner, String prompt) {
        int score = readInt(scanner, prompt);
        while (score < 0) {
            System.out.println("Score cannot be negative. Try again.");
            score = readInt(scanner, prompt);
        }
        return score;
    }

    public static void handleAddPlayer(Scanner scanner, PlayerManager manager) {
        String name = readPlayerName(scanner);
        int score = readPlayerScore(scanner, "Enter player score: ");
        manager.addPlayer(name, score);
    }
    public static void handleSearchPlayer(Scanner scanner, PlayerManager manager) {
        String searchName = readPlayerName(scanner);
        manager.printSearchResult(searchName);
    }
    public static void handleUpdatePlayerScore(Scanner scanner, PlayerManager manager) {
        String searchName = readPlayerName(scanner);
        if (manager.findPlayerByName(searchName) == null) {
            System.out.println("Player not found.");
        }  else {
            int newScore = readPlayerScore(scanner, "Enter new score: ");
            manager.updatePlayerScore(searchName, newScore);
        }
    }
    public static void handleRemovePlayer(Scanner scanner, PlayerManager manager) {
        String searchName = readPlayerName(scanner);
        manager.removePlayer(searchName);
    }

}
