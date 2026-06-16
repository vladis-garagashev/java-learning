package month1.week4.day5;


import java.util.Scanner;

public class InputReader {
    private final Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    private int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();
                return number;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }
    public int readMenuChoice() {

        int choice = readInt("Choose option: ");

        while (choice < 0 || choice > 10) {
            System.out.println("Invalid option. Choose from 0 to 10.");
            choice = readInt("Choose option: ");

        }
        return choice;
    }
    public String readPlayerName() {
        System.out.print("Enter player name: ");
        return scanner.nextLine();
    }
    public int readPlayerScore(String prompt) {
        int score = readInt(prompt);
        while (score < 0) {
            System.out.println("Score cannot be negative. Try again.");
            score = readInt(prompt);
        }
        return score;
    }

}
