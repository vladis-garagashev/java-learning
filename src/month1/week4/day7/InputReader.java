package month1.week4.day7;


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
    public String readStudentName() {
        System.out.print("Enter student name: ");
        return scanner.nextLine();
    }
    public int readStudentGrade(String prompt) {
        int grade = readInt(prompt);
        while (grade < 0 || grade > 100) {
            if (grade < 0) {
                System.out.println("Grade cannot be negative. Try again.");
            } else {
                System.out.println("Grade cannot be greater than 100. Try again.");

            }
            grade = readInt(prompt);
        }

        return grade;
    }

}
