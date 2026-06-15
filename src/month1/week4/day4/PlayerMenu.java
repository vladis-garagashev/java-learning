package month1.week4.day4;

import java.util.ArrayList;

public class PlayerMenu {
    private final PlayerManager manager;
    private final InputReader inputReader;

    public PlayerMenu(PlayerManager manager) {
        this.manager = manager;
        this.inputReader = new InputReader();
    }

    public void start() {
        int choice = -1;

        while (choice != 0) {
            printMenu();
            choice = inputReader.readMenuChoice();
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
    private void handleMenuChoice(int choice) {
        switch (choice) {
            case 1 -> handlePrintAllPlayers();
            case 2 -> handleAddPlayer();
            case 3 -> handleSearchPlayer();
            case 4 -> handleUpdatePlayerScore();
            case 5 -> handleRemovePlayer();
            case 6 -> handleShowBestPlayer();
            case 7 -> handleShowLowestPlayer();
            case 8 -> handleShowAverageScore();
            case 9 -> handleShowPlayersAboveAverage();
            case 10 -> handleFinalReport();
            case 0 -> System.out.println("Goodbye!");
        }
    }

    private void handlePrintAllPlayers() {
        if (manager.hasNoPlayers()) {
            System.out.println("No players.");
            return;
        }

        ArrayList<Player> players = manager.getPlayers();

        System.out.println("All players:");
        for (Player player : players) {
            System.out.println(player.getInfo());
        }
    }

    private void handleAddPlayer() {
        String name = inputReader.readPlayerName();
        int score = inputReader.readPlayerScore("Enter player score: ");
        manager.addPlayer(name, score);
        System.out.println("Player added.");
    }
    private void handleSearchPlayer() {
        String searchName = inputReader.readPlayerName();

        Player foundPlayer  = manager.findPlayerByName(searchName);
        if (foundPlayer == null) {
            System.out.println("Player not found.");
            return;
        }
        System.out.println(foundPlayer.getInfo());

    }
    private void handleUpdatePlayerScore() {
        String searchName = inputReader.readPlayerName();

        if (manager.findPlayerByName(searchName) == null) {
            System.out.println("Player not found.");
            return;
        }

        int newScore = inputReader.readPlayerScore("Enter new score: ");
        boolean updated = manager.updatePlayerScore(searchName, newScore);

        if (updated) {
            System.out.println("Player score updated.");
        } else {
            System.out.println("Failed to update player.");
        }
    }
    private void handleRemovePlayer() {
        String searchName = inputReader.readPlayerName();

        boolean removed = manager.removePlayer(searchName);

        if (removed) {
            System.out.println("Player removed.");
        } else {
            System.out.println("Player not found.");
        }
    }

    private void handleShowBestPlayer() {
        Player bestPlayer = manager.findBestPlayer();

        if (bestPlayer == null) {
            System.out.println("No players.");
            return;
        }

        System.out.println("Best player:");
        System.out.println(bestPlayer.getInfo());
    }
    private void handleShowLowestPlayer() {
        Player lowestPlayer = manager.findLowestPlayer();

        if (lowestPlayer == null) {
            System.out.println("No players.");
            return;
        }

        System.out.println("Lowest player:");
        System.out.println(lowestPlayer.getInfo());
    }

    private void handleShowTotalScore() {
        if (manager.hasNoPlayers()) {
            System.out.println("No players.");
            return;
        }

        int totalScore = manager.calculateTotal();
        System.out.println("Total score: " + totalScore);

    }
    private void handleShowAverageScore() {
        if (manager.hasNoPlayers()) {
            System.out.println("No players.");
            return;
        }

        double averageScore = manager.calculateAverage();
        System.out.printf("Average score: %.2f%n", averageScore);
    }

    private  void handleShowPlayersAboveAverage() {
        if (manager.hasNoPlayers()) {
            System.out.println("No players.");
            return;
        }

        ArrayList<Player> playersAboveAverage = manager.findPlayersAboveAverage();

        if (playersAboveAverage.isEmpty()) {
            System.out.println("No players above average.");
            return;
        }

        System.out.println("Players above average:");
        for (Player player : playersAboveAverage) {
            System.out.println(player.getInfo());
        }
    }

    private void handleFinalReport() {

        if (manager.hasNoPlayers()) {
            System.out.println("No players.");
            return;
        }

        System.out.println("Final report:");
        System.out.println();
        handlePrintAllPlayers();
        System.out.println();
        handleShowBestPlayer();
        System.out.println();
        handleShowLowestPlayer();
        System.out.println();
        handleShowTotalScore();
        handleShowAverageScore();
        System.out.println();
        handleShowPlayersAboveAverage();

    }


}
