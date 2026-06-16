package month1.week4.day7;

public class Day7Final {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        StudentMenu menu = new StudentMenu(manager);

        menu.start();
    }
}
