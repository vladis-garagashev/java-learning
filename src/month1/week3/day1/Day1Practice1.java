package month1.week3.day1;

public class Day1Practice1 {
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

        System.out.println(player1.name + " - " + player1.score);
        System.out.println(player2.name + " - " + player2.score);
        System.out.println(player3.name + " - " + player3.score);
        System.out.println();


        Player bestPlayer = player1;

        if (player2.score > bestPlayer.score) {
            bestPlayer = player2;
        }

        if (player3.score > bestPlayer.score) {
            bestPlayer = player3;
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

        System.out.println("Lowest player:");
        System.out.println(lowestPlayer.name + " - " + lowestPlayer.score);
        System.out.println();

        bestPlayer.score += 10;

        System.out.println("Bonus for best player:");
        System.out.println(player1.name + " - " + player1.score);
        System.out.println(player2.name + " - " + player2.score);
        System.out.println(player3.name + " - " + player3.score);
        System.out.println();

        int totalScore = player1.score + player2.score + player3.score;
        double averageScore = (double) totalScore / 3;


        System.out.println("Average score after bonus:");
        System.out.printf("%.2f%n", averageScore);

    }

}
