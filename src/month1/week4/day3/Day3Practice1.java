package month1.week4.day3;

public class Day3Practice1 {
    public static void main(String[] args) {
        PlayerManager manager = new PlayerManager();
        PlayerMenu menu = new PlayerMenu(manager);

        menu.start();
    }
}
