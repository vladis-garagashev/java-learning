package month1.week4.day2;

import java.util.Scanner;

public class PlayerMenu {
    private final  Scanner scanner;
    private final PlayerManager manager;

    public PlayerMenu(PlayerManager manager) {
        this.manager = manager;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int choice = -1;

        while (choice != 0) {
            printMenu();
            choice = readMenuChoice();
            System.out.println();

            handleMenuChoice(choice);

            System.out.println();
        }
    }

    private void printMenu() {
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

    private int readMenuChoice() {

        int choice = readInt("Choose option: ");

        while (choice < 0 || choice > 10) {
            System.out.println("Invalid option. Choose from 0 to 10.");
            choice = readInt("Choose option: ");

        }
        return choice;
    }
    private void handleMenuChoice(int choice) {
        switch (choice) {
            case 1 -> manager.printPlayers();
            case 2 -> handleAddPlayer();
            case 3 -> handleSearchPlayer();
            case 4 -> handleUpdatePlayerScore();
            case 5 -> handleRemovePlayer();
            case 6 -> manager.printBestPlayer();
            case 7 -> manager.printLowestPlayer();
            case 8 -> manager.printAverageScore();
            case 9 -> manager.printPlayersAboveAverage();
            case 10 -> manager.printFinalReport();
            case 0 -> System.out.println("Goodbye!");
        }
    }

    private int readInt(String prompt) {
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
    private String readPlayerName() {
        System.out.print("Enter player name: ");
        return scanner.nextLine();
    }
    private int readPlayerScore(String prompt) {
        int score = readInt(prompt);
        while (score < 0) {
            System.out.println("Score cannot be negative. Try again.");
            score = readInt(prompt);
        }
        return score;
    }

    private void handleAddPlayer() {
        String name = readPlayerName();
        int score = readPlayerScore("Enter player score: ");
        manager.addPlayer(name, score);
    }
    private void handleSearchPlayer() {
        String searchName = readPlayerName();
        manager.printSearchResult(searchName);
    }
    private void handleUpdatePlayerScore() {
        String searchName = readPlayerName();
        if (manager.findPlayerByName(searchName) == null) {
            System.out.println("Player not found.");
        }  else {
            int newScore = readPlayerScore("Enter new score: ");
            manager.updatePlayerScore(searchName, newScore);
        }
    }
    private void handleRemovePlayer() {
        String searchName = readPlayerName();
        manager.removePlayer(searchName);
    }

}
