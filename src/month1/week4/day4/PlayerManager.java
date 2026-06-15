package month1.week4.day4;

import java.util.ArrayList;

public class PlayerManager {
    private final ArrayList<Player> players;

    public PlayerManager() {
        players = new ArrayList<>();
    }

    public boolean hasNoPlayers() {
        return players.isEmpty();
    }

    public ArrayList<Player> getPlayers() {
        return new ArrayList<>(players);
    }
    public void addPlayer(String name, int score) {
        players.add(new Player(name, score));
    }
    public boolean updatePlayerScore(String name, int newScore) {
        Player foundPlayer = findPlayerByName(name);
        if (foundPlayer == null) {
            return false;
        }

        foundPlayer.setScore(newScore);
        return true;

    }
    public boolean removePlayer(String name) {
        Player foundPlayer = findPlayerByName(name);
        if (foundPlayer == null) {
            return false;
        }

        players.remove(foundPlayer);
        return true;
    }
    public Player findPlayerByName(String searchName) {
        for(Player player : players) {
            if(player.getName().equalsIgnoreCase(searchName)) {
                return player;
            }
        }
        return null;
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

    public int calculateTotal() {
        int total = 0;

        for (Player player : players) {
            total += player.getScore();
        }
        return total;
    }
    public double calculateAverage() {
        if (players.isEmpty()) {
            return 0;
        }
        int total = calculateTotal();
        return (double) total / players.size();

    }

    public ArrayList<Player> findPlayersAboveAverage() {

        if (players.isEmpty()) {
            return new ArrayList<>();
        }

        double average = calculateAverage();
        ArrayList<Player> playersAboveAverage = new ArrayList<>();
        for (Player player : players) {
            if (player.getScore() > average) {
                playersAboveAverage.add(player);
            }
        }
        return playersAboveAverage;
    }

}
