package month1.week3.day4;

public class Day4Final {
    public static void main(String[] args) {
        Player player1 = new Player("Alex", 80);
        Player player2 = new Player("Bob", 100);
        Player player3 = new Player("", 70);
        Player player4 = new Player(null, 40);
        Player player5 = new Player("Mike", -30);

        System.out.println("All players:");
        player1.printInfo();
        player2.printInfo();
        player3.printInfo();
        player4.printInfo();
        player5.printInfo();

        player3.setName("John");
        player4.setName("Kate");
        player5.addBonus(60);
        player1.addBonus(15);
        player2.addBonus(-50);
        player2.transferScoreTo(player3, 20);
        player5.transferScoreTo(player1, 10);
        player4.transferScoreTo(player2, 1000);
        player1.transferScoreTo(null, 10);

        System.out.println();
        System.out.println("After changes:");
        player1.printInfo();
        player2.printInfo();
        player3.printInfo();
        player4.printInfo();
        player5.printInfo();

        System.out.println();
        System.out.println("Checks:");
        printPlayerAboveAverage(player1, 75);
        printPlayerAboveAverage(player5, 75);
        printScoreComparison(player2, player3);
        printScoreComparison(player3, player4);
    }

    public static void printPlayerAboveAverage(Player player, double average) {
        System.out.println(player.getName() + " Above Average " + average + ": " + player.isAboveAverage(average));
    }

    public static void printScoreComparison(Player firstPlayer, Player secondPlayer) {
        System.out.println(firstPlayer.getName() + " has higher score than " + secondPlayer.getName() + ": " + firstPlayer.hasHigherScoreThan(secondPlayer));
    }
}
