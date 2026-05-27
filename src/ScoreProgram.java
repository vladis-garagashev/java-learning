public class ScoreProgram {

    static void startGame() {
        int userScore = 80;
        int bonus = 10;
        int finalScore = addBonus(userScore, bonus);

        showGreeting();
        showUserScore(userScore);
        showBonus(bonus);
        showFinalScore(finalScore);
    }

    static void showGreeting() {
        System.out.println("Welcome!");
    }

    static void showUserScore(int userScore) {
        System.out.println("User score: " + userScore);
    }

    static void showBonus(int bonus) {
        System.out.println("Bonus: " + bonus);
    }

    static int addBonus(int userScore, int bonus) {
        return userScore + bonus;
    }

    static void showFinalScore(int finalScore) {
        System.out.println("Final score: " + finalScore);
    }

    public static void main(String[] args) {
        startGame();
    }
}
