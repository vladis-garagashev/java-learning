package month1.week3.day3;

public class Day3Final {
    public static void main(String[] args) {
        Player player1 = new Player("Alex", 80);
        Player player2 = new Player("Bob", 95);
        Player player3 = new Player("John", -20);
        Player player4 = new Player("Mike");
        Player player5 = new Player("", 60);
        Player player6 = new Player();


        System.out.println("All players:");
        player1.printInfo();
        player2.printInfo();
        player3.printInfo();
        player4.printInfo();
        player5.printInfo();
        player6.printInfo();

        Player bestPlayer = player1;

        if (player2.score > bestPlayer.score) {
            bestPlayer = player2;
        }
        if (player3.score > bestPlayer.score) {
            bestPlayer = player3;
        }
        if (player4.score > bestPlayer.score) {
            bestPlayer = player4;
        }
        if (player5.score > bestPlayer.score) {
            bestPlayer = player5;
        }
        if (player6.score > bestPlayer.score) {
            bestPlayer = player6;
        }

        System.out.println();
        System.out.println("Best player:");
        bestPlayer.printInfo();


        Player lowestPlayer = player1;

        if (player2.score < lowestPlayer.score) {
            lowestPlayer = player2;
        }
        if (player3.score < lowestPlayer.score) {
            lowestPlayer = player3;
        }
        if (player4.score < lowestPlayer.score) {
            lowestPlayer = player4;
        }
        if (player5.score < lowestPlayer.score) {
            lowestPlayer = player5;
        }
        if (player6.score < lowestPlayer.score) {
            lowestPlayer = player6;
        }

        System.out.println();
        System.out.println("Lowest player:");
        lowestPlayer.printInfo();

        int totalScore = player1.score + player2.score + player3.score + player4.score + player5.score + player6.score;
        double averageScore = (double) totalScore / 6;

        System.out.println();
        System.out.println("Total score: " + totalScore);
        System.out.printf("Average score: %.2f%n", averageScore);

    }
}
