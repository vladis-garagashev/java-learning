package month1.week3.day4;

public class Day4Practice1 {
    public static void main(String[] args) {
        Player player1 = new Player("Alex", 80);
        Player player2 = new Player("", 95);
        Player player3 = new Player("John", -20);
        Player player4 = new Player();
        Player player5 = new Player(null, 50);

        System.out.println("All players:");
        player1.printInfo();
        player2.printInfo();
        player3.printInfo();
        player4.printInfo();
        player5.printInfo();

        player1.addBonus(10);
        player3.addBonus(-50);
        player2.setName("Bob");
        player2.setScore(100);

        System.out.println();
        System.out.println("After changes:");
        player1.printInfo();
        player2.printInfo();
        player3.printInfo();
        player4.printInfo();
        player5.printInfo();

        System.out.println();
        System.out.println("Checks:");
        printPlayerAboveAverage(player1, 70);
        printPlayerAboveAverage(player3, 70);
        printScoreComparison(player1, player2);
        printScoreComparison(player2, player1);

        player2.transferScoreTo(player3, 30);
        player1.transferScoreTo(player3, -10);
        player3.transferScoreTo(player1, 500);
        player2.transferScoreTo(null, 10);

        System.out.println();
        System.out.println("Score transfer:");
        player1.printInfo();
        player2.printInfo();
        player3.printInfo();
        player4.printInfo();
        player5.printInfo();

    }

    public static void printPlayerAboveAverage(Player player, double average) {
        System.out.println(player.getName() + " Above Average " + average + ": " + player.isAboveAverage(average));
    }

    public static void printScoreComparison(Player firstPlayer, Player secondPlayer) {
        if (firstPlayer.hasHigherScoreThan(secondPlayer)) {
            System.out.println(firstPlayer.getName() + " has higher score than " + secondPlayer.getName());
        } else {
            System.out.println(firstPlayer.getName() + " does not have higher score than " + secondPlayer.getName());
        }
    }

}
