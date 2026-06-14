package month1.week3.day6;

public class Day6Practice1 {
    public static void main(String[] args) {
        PlayerManager manager = new PlayerManager();

        manager.addPlayer("Alex", 80);
        manager.addPlayer("Bob", 95);
        manager.addPlayer("John", 70);

        manager.printPlayers();

        System.out.println();
        manager.printSearchResult("Bob");
        System.out.println();
        manager.printSearchResult("Mike");

        System.out.println();
        manager.updatePlayerScore("Bob", 100);
        System.out.println();
        manager.updatePlayerScore("Mike", 50);

        System.out.println();
        manager.printPlayers();

        System.out.println();
        manager.removePlayer("John");
        System.out.println();
        manager.removePlayer("Mike");

        System.out.println();
        manager.printFinalReport();

        System.out.println();
        PlayerManager emptyManager = new PlayerManager();
        emptyManager.printFinalReport();
    }
}
