package month1.week4.day6;

public class Day6Practice1 {
    public static void main(String[] args) {
        PlayerManager manager = new PlayerManager();
        PlayerMenu menu = new PlayerMenu(manager);

        menu.start();
    }
}
