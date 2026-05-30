package month1.week1.day3;

public class Methods7 {

    static void title() {
        System.out.println("=== MENU ===");
    }

    static void options() {
        System.out.println("1. Start");
        System.out.println("2. Exit");
    }

    static void showMenu() {
        title();
        options();
    }

    public static void main(String[] args) {
        showMenu();
    }
}
