package month1.week3.day2;

public class Player {
    String name;
    int score;

    String getInfo() {
        return name + " : " + score;
    }


    void printInfo() {
        System.out.println(getInfo());
    }

    void addBonus(int bonus) {
        score += bonus;
    }

    boolean isAboveAverage(double average) {
        return score > average;
    }

    void setName(String name) {
        this.name = name;
    }
    void setScore(int score) {
        this.score = score;
    }

    boolean hasHigherScoreThan(Player otherPlayer) {
        return this.score > otherPlayer.score;
    }

    void transferScoreTo(Player otherPlayer, int points) {
        otherPlayer.addBonus(points);
        this.score -= points;
    }
}
