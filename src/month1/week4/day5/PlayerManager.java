package month1.week4.day5;

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

    public AddPlayerResult addPlayer(String name, int score) {

        if (name == null || name.isBlank()) {
            return AddPlayerResult.INVALID_NAME;
        }

        String normalizedName = name.strip();

        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(normalizedName)) {
                return AddPlayerResult.DUPLICATE_NAME;
            }
        }

        players.add(new Player(normalizedName, score));
        return AddPlayerResult.SUCCESS;

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
        if (searchName == null || searchName.isBlank()) {
            return null;
        }

        String normalizedName = searchName.strip();
        for(Player player : players) {
            if(player.getName().equalsIgnoreCase(normalizedName)) {
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
