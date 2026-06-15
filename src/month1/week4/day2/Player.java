package month1.week4.day2;

public class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        setName(name);
        setScore(score);

    }
    public Player(String name) {
        this(name ,0);
    }
    public Player() {
        this("Unknown" ,0);
    }


    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }
    public void setScore(int score) {
        this.score = Math.max(score, 0);
    }

    public void printInfo() {
        System.out.println(getInfo());
    }
    public String getInfo() {
        return name + ": " + score;
    }

    public void addBonus(int bonus) {
        if (bonus > 0) {
            score += bonus;
        }
    }
    public boolean isAboveAverage(double average) {
        return score > average;
    }
    public boolean hasHigherScoreThan(Player otherPlayer) {
        return otherPlayer != null && this.score > otherPlayer.getScore();
    }
}
