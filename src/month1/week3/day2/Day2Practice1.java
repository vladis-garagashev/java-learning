package month1.week3.day2;

public class Day2Practice1 {
    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        player1.name = "Alex";
        player1.score = 80;
        player2.name = "Bob";
        player2.score = 95;
        player3.name = "John";
        player3.score = 70;

        System.out.println("All players before bonus:");
        player1.printInfo();
        player2.printInfo();
        player3.printInfo();
        System.out.println();

        player3.setName("Johnny");
        player2.addBonus(10);
        player3.setScore(90);

        System.out.println("All players after updates:");
        player1.printInfo();
        player2.printInfo();
        player3.printInfo();
        System.out.println();

        int totalScore = player1.score + player2.score + player3.score;
        double averageScore = (double) totalScore / 3;

        System.out.println("Players above average:");
        if (player1.isAboveAverage(averageScore)) {
            player1.printInfo();
        }
        if (player2.isAboveAverage(averageScore)) {
            player2.printInfo();
        }
        if (player3.isAboveAverage(averageScore)) {
            player3.printInfo();
        }
        System.out.println();

        System.out.println("Score comparisons:");
        printScoreComparison(player2, player1);
        printScoreComparison(player3, player1);
        printScoreComparison(player1, player3);
        System.out.println();

        player2.transferScoreTo(player1, 15);

        System.out.println("Score transfer:");
        player1.printInfo();
        player2.printInfo();
        player3.printInfo();

    }

    static void printScoreComparison(Player firstPlayer, Player secondPlayer) {
        if (firstPlayer.hasHigherScoreThan(secondPlayer)) {
            System.out.println(firstPlayer.name + " has higher score than " + secondPlayer.name);
        } else {
            System.out.println(firstPlayer.name + " does not have higher score than " + secondPlayer.name);
        }
    }

}
