package month1.week3.day3;

public class Player {
    String name;
    int score;

    public Player(String name, int score) {
        if (name.isBlank()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }

        if (score < 0) {
            this.score = 0;
        } else {
            this.score = score;
        }
    }
    public Player(String name) {
        this(name ,0);
    }
    public Player() {
        this("Unknown" ,0);
    }

    String getInfo() {
        return name + ": " + score;
    }

    void printInfo() {
        System.out.println(getInfo());
    }

}
