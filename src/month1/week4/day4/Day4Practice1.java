package month1.week4.day4;

public class Day4Practice1 {
    public static void main(String[] args) {
        PlayerManager manager = new PlayerManager();
        PlayerMenu menu = new PlayerMenu(manager);

        menu.start();
    }
}
