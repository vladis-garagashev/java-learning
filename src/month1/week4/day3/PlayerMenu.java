package month1.week4.day3;

public class PlayerMenu {
    private final PlayerManager manager;
    private final  InputReader inputReader;

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

    private void handleAddPlayer() {
        String name = inputReader.readPlayerName();
        int score = inputReader.readPlayerScore("Enter player score: ");
        manager.addPlayer(name, score);
    }
    private void handleSearchPlayer() {
        String searchName = inputReader.readPlayerName();
        manager.printSearchResult(searchName);
    }
    private void handleUpdatePlayerScore() {
        String searchName = inputReader.readPlayerName();
        if (manager.findPlayerByName(searchName) == null) {
            System.out.println("Player not found.");
        }  else {
            int newScore = inputReader.readPlayerScore("Enter new score: ");
            manager.updatePlayerScore(searchName, newScore);
        }
    }
    private void handleRemovePlayer() {
        String searchName = inputReader.readPlayerName();
        manager.removePlayer(searchName);
    }

}
