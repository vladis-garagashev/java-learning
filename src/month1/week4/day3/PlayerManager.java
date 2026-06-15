package month1.week4.day3;

import java.util.ArrayList;

public class PlayerManager {
    private final ArrayList<Player> players;

    public PlayerManager() {
        players = new ArrayList<>();
    }

    public void printPlayers() {
        if (players.isEmpty()) {
            System.out.println("No players.");
        } else {
            System.out.println("All players:");
            for (Player player : players) {
                player.printInfo();
            }
        }
    }

    public void addPlayer(String name, int score) {
        players.add(new Player(name, score));
        System.out.println("Player added.");
    }
    public void updatePlayerScore(String name, int newScore) {
        Player foundPlayer = findPlayerByName(name);
        if (foundPlayer == null) {
            System.out.println("Player not found.");
        } else {
            int oldScore = foundPlayer.getScore();
            foundPlayer.setScore(newScore);
            System.out.println("Player updated.");
            System.out.println("Old score: " + oldScore);
            System.out.println("New score: " + foundPlayer.getScore());
        }

    }
    public void removePlayer(String name) {
        Player foundPlayer = findPlayerByName(name);
        if (foundPlayer == null) {
            System.out.println("Player not found.");
        } else {
            players.remove(foundPlayer);
            System.out.println("Player removed.");

        }

    }

    public Player findPlayerByName(String searchName) {
        for(Player player : players) {
            if(player.getName().equalsIgnoreCase(searchName)) {
                return player;
            }
        }
        return null;
    }
    public void printSearchResult(String searchName) {
        Player foundPlayer  = findPlayerByName(searchName);
        if (foundPlayer  == null) {
            System.out.println("Player not found.");
        } else {
            foundPlayer .printInfo();
        }
    }

    public Player findBestPlayer() {
        if (players.isEmpty()) {
            return null;
        }

        Player bestPlayer = players.get(0);;

        for (int i = 1; i < players.size(); i++) {
            if (players.get(i).getScore() > bestPlayer.getScore()) {
                bestPlayer = players.get(i);
            }
        }
        return bestPlayer;
    }
    public void printBestPlayer() {
        Player bestPlayer = findBestPlayer();
        if (bestPlayer == null) {
            System.out.println("No players.");
        } else {
            System.out.println("Best player:");
            bestPlayer.printInfo();
        }
    }

    public Player findLowestPlayer() {
        if (players.isEmpty()) {
            return null;
        }

        Player lowestPlayer = players.get(0);;

        for (int i = 1; i < players.size(); i++) {

            if (players.get(i).getScore() < lowestPlayer.getScore()) {
                lowestPlayer = players.get(i);
            }
        }
        return lowestPlayer;
    }
    public void printLowestPlayer() {
        Player lowestPlayer = findLowestPlayer();
        if (lowestPlayer == null) {
            System.out.println("No players.");
        } else {
            System.out.println("Lowest player:");
            lowestPlayer.printInfo();
        }
    }

    public int calculateTotal() {
        int total = 0;

        for (Player player : players) {
            total += player.getScore();
        }
        return total;
    }
    public void printTotal() {
        if (players.isEmpty()) {
            System.out.println("No players.");
        } else {
            int total = calculateTotal();
            System.out.println("Total score: " + total);
        }
    }

    public double calculateAverage() {
        if (players.isEmpty()) {
            return 0;
        }
        int total = calculateTotal();
        return (double) total / players.size();

    }
    public void printAverageScore() {
        if (players.isEmpty()) {
            System.out.println("No players.");
        } else {
            double average = calculateAverage();
            System.out.printf("Average score: %.2f%n", average);
        }
    }
    public void printPlayersAboveAverage() {

        if (players.isEmpty()) {
            System.out.println("No players.");
        } else {
            boolean found = false;
            double average = calculateAverage();
            System.out.println("Players above average:");
            for (Player player : players) {
                if(player.isAboveAverage(average)) {
                    player.printInfo();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No players above average.");
            }
        }
    }

    public void printFinalReport() {
        System.out.println("Final report:");
        System.out.println();

        if (players.isEmpty()) {
            System.out.println("No players.");
        } else {
            printPlayers();
            System.out.println();
            printBestPlayer();
            System.out.println();
            printLowestPlayer();
            System.out.println();
            printTotal();
            System.out.println();
            printAverageScore();
            System.out.println();
            printPlayersAboveAverage();
        }
    }
}
