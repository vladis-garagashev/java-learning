public class Day3Final {
    public static void main(String[] args) {
        String name = "Alex";
        int level = 5;
        int bonusLevel = 2;

        showProfile(name, level, bonusLevel);
    }
    static void showProfile(String name, int level, int bonusLevel) {
        int finalLevel = addBonusLevel(level, bonusLevel);

        showProfileText();
        showName(name);
        showLevel(level);
        showBonusLevel(bonusLevel);
        showFinalLevel(finalLevel);
    }
    static void showProfileText() {
        System.out.println("=== PLAYER PROFILE ===");
    }

    static void showName(String name) {
        System.out.println("Name: " + name);
    }

    static void showLevel(int level) {
        System.out.println("Level: " + level);
    }

    static void showBonusLevel(int bonusLevel) {
        System.out.println("Bonus level: " + bonusLevel);
    }

    static void showFinalLevel(int finalLevel) {
        System.out.println("Final level: " + finalLevel);
    }

    static int addBonusLevel(int level, int bonusLevel) {
        return level + bonusLevel;
    }

}
