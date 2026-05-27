public class GameMenu {

    static void startGame() {
        showGreeting();
        showRules();
        showMenu();

    }
    static void showGreeting() {
        System.out.println("Welcome to the game!");
    }
    static void showRules() {
        System.out.println("Rules:");
        rules();
    }
    static void rules() {
        System.out.println("Guess the number from 1 to 10.");
    }
    static void showMenu() {
        System.out.println("=== MENU ===");
        menu();
    }
    static void menu() {
        System.out.println("1. Start");
        System.out.println("2. Exit");
    }

    public static void main(String[] args) {
        startGame();
    }
}
