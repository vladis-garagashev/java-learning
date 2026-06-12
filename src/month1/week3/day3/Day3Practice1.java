package month1.week3.day3;

public class Day3Practice1 {
    public static void main(String[] args) {

        Player player1 = new Player("Alex", 80);
        Player player2 = new Player("Bob", 95);
        Player player3 = new Player("John", 70);
        Player player4 = new Player("Mike");
        Player player5 = new Player("Том", -50);
        Player player6 = new Player("", 60);
        Player player7 = new Player(" ", 40);
        Player player8 = new Player();


        System.out.println("All players:");
        player1.printInfo();
        player2.printInfo();
        player3.printInfo();
        player4.printInfo();
        player5.printInfo();
        player6.printInfo();
        player7.printInfo();
        player8.printInfo();

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
        if (player7.score > bestPlayer.score) {
            bestPlayer = player7;
        }
        if (player8.score > bestPlayer.score) {
            bestPlayer = player8;
        }

        System.out.println();
        System.out.println("Best player:");
        bestPlayer.printInfo();

    }

}
