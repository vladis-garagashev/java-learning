package month1.week3.day5;

import java.util.ArrayList;

public class Day5Final {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();

        players.add(new Player("Alex", 60));
        players.add(new Player("Bob", 90));
        players.add(new Player("John", 75));
        players.add(new Player("Mike", 110));
        players.add(new Player("Kate", 85));

        printPlayers(players);

        System.out.println();
        printSearchResult(players, "mike");
        System.out.println();
        printSearchResult(players, "Tom");
        System.out.println();
        updatePlayerScore(players, "Alex", 95);
        System.out.println();
        removePlayer(players, "John");
        System.out.println();
        addPlayer(players, "Tom", 70);
        System.out.println();
        printFinalReport(players);
    }

    public static void printPlayers(ArrayList<Player> players) {
        if (players.isEmpty()) {
            System.out.println("No players.");
        } else {
            System.out.println("All players:");
            for (Player player : players) {
                player.printInfo();
            }
        }
    }

    public static Player findBestPlayer(ArrayList<Player> players) {
        Player bestPlayer = players.getFirst();


        for (int i = 1; i < players.size(); i++) {
            if (players.get(i).getScore() > bestPlayer.getScore()) {
                bestPlayer = players.get(i);
            }
        }
        return bestPlayer;
    }
    public static void printBestPlayer(ArrayList<Player> players) {
        if (players.isEmpty()) {
            System.out.println("No players.");
        } else {
            Player bestPlayer = findBestPlayer(players);
            System.out.println("Best player:");
            bestPlayer.printInfo();
        }
    }

    public static Player findLowestPlayer(ArrayList<Player> players) {
        Player lowestPlayer = players.getFirst();

        for (int i = 1; i < players.size(); i++) {

            if (players.get(i).getScore() < lowestPlayer.getScore()) {
                lowestPlayer = players.get(i);
            }
        }
        return lowestPlayer;
    }
    public static void printLowestPlayer(ArrayList<Player> players) {
        if (players.isEmpty()) {
            System.out.println("No players.");
        } else {
            Player lowestPlayer = findLowestPlayer(players);
            System.out.println("Lowest player:");
            lowestPlayer.printInfo();

        }
    }

    public static int calculateTotal(ArrayList<Player> players) {
        int total = 0;

        for (Player player : players) {
            total += player.getScore();
        }
        return total;
    }
    public static void printTotal(ArrayList<Player> players) {
        if (players.isEmpty()) {
            System.out.println("No players.");
        } else {
            int total = calculateTotal(players);
            System.out.println("Total score: " + total);
        }
    }

    public static double calculateAverage(ArrayList<Player> players) {
        int total = calculateTotal(players);
        return (double) total / players.size();
    }
    public static void printAverageScore(ArrayList<Player> players) {
        if (players.isEmpty()) {
            System.out.println("No players.");
        } else {
            double average = calculateAverage(players);
            System.out.printf("Average score: %.2f%n", average);
        }
    }

    public static void printPlayersAboveAverage(ArrayList<Player> players ) {
        if (players.isEmpty()) {
            System.out.println("No players.");
        } else {
            double average = calculateAverage(players);
            System.out.println("Players above average:");
            for (Player player : players) {
                if(player.isAboveAverage(average)) {
                    player.printInfo();
                }
            }
        }
    }

    public static Player findPlayerByName(ArrayList<Player> players, String searchName) {
        for(Player player : players) {
            if(player.getName().equalsIgnoreCase(searchName)) {
                return player;
            }
        }
        return null;
    }
    public static void printSearchResult(ArrayList<Player> players, String searchName) {
        Player searchPlayer = findPlayerByName(players, searchName);
        System.out.println("Search result for " + searchName + ":");
        if (searchPlayer == null) {
            System.out.println("Player not found.");
        } else {
            searchPlayer.printInfo();
        }
    }

    public static void updatePlayerScore(ArrayList<Player> players, String searchName, int newScore) {
        Player searchPlayer = findPlayerByName(players, searchName);
        System.out.println("Update score fo " + searchName + ":");
        if (searchPlayer == null) {
            System.out.println("Player not found.");
        } else {
            searchPlayer.setScore(newScore);
            System.out.println("Score updated.");
        }

    }
    public static void removePlayer(ArrayList<Player> players, String searchName) {
        Player searchPlayer = findPlayerByName(players, searchName);
        System.out.println("Remove player " + searchName + ":");
        if (searchPlayer == null) {
            System.out.println("Player not found.");
        } else {
            players.remove(searchPlayer);
            System.out.println("Player removed.");
        }
    }
    public static void addPlayer(ArrayList<Player> players, String name, int score) {
        System.out.println("Add player " + name + ":");
        players.add(new Player(name, score));
        System.out.println("Player added.");
    }

    public static void printFinalReport(ArrayList<Player> players) {
        System.out.println("Final report:");
        printPlayers(players);
        System.out.println();
        printBestPlayer(players);
        System.out.println();
        printLowestPlayer(players);
        System.out.println();
        printTotal(players);
        printAverageScore(players);
        System.out.println();
        printPlayersAboveAverage(players);
    }
}
