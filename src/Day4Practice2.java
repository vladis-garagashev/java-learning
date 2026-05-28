public class Day4Practice2 {

    public static void main(String[] args) {
        int[] scores = {80, 95, 70, 100, 60};
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            total = total + scores[i];
        }

        System.out.println("Total score: " + total);
    }
}
