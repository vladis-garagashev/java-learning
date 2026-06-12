package month1.week3.day1;

public class Day1Final {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();

        player1.name = "Alex";
        player1.score = 80;
        player2.name = "Bob";
        player2.score = 95;
        player3.name = "John";
        player3.score = 70;
        player4.name = "Mike";
        player4.score = 100;


        System.out.println("All players:");
        System.out.println(player1.name + " - " + player1.score);
        System.out.println(player2.name + " - " + player2.score);
        System.out.println(player3.name + " - " + player3.score);
        System.out.println(player4.name + " - " + player4.score);
        System.out.println();


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

        System.out.println("Best player:");
        System.out.println(bestPlayer.name + " - " + bestPlayer.score);
        System.out.println();


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

        System.out.println("Lowest player:");
        System.out.println(lowestPlayer.name + " - " + lowestPlayer.score);
        System.out.println();

        lowestPlayer.score += 5;

        System.out.println("Bonus for lowest player:");
        System.out.println(player1.name + " - " + player1.score);
        System.out.println(player2.name + " - " + player2.score);
        System.out.println(player3.name + " - " + player3.score);
        System.out.println(player4.name + " - " + player4.score);
        System.out.println();

        int totalScore = player1.score + player2.score + player3.score + player4.score;
        double averageScore = (double) totalScore / 4;


        System.out.println("Average score after bonus:");
        System.out.printf("%.2f%n", averageScore);

    }
}
