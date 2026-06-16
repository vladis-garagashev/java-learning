package month1.week4.day7;

import java.util.ArrayList;

public class StudentMenu {
    private final StudentManager manager;
    private final InputReader inputReader;

    public StudentMenu(StudentManager manager) {
        this.manager = manager;
        this.inputReader = new InputReader();
    }

    public void start() {
        int choice = -1;

        while (choice != 0) {
            printMenu();
            choice = inputReader.readMenuChoice();
            System.out.println();

            handleMenuChoice(choice);

            System.out.println();
        }
    }

    private void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Print all students");
        System.out.println("2. Add student");
        System.out.println("3. Search student by name");
        System.out.println("4. Update student grade");
        System.out.println("5. Remove student");
        System.out.println("6. Show best student");
        System.out.println("7. Show lowest student");
        System.out.println("8. Show average grade");
        System.out.println("9. Show students above average");
        System.out.println("10. Show final report");
        System.out.println("0. Exit");
    }
    private void handleMenuChoice(int choice) {
        switch (choice) {
            case 1 -> handlePrintAllStudents();
            case 2 -> handleAddStudent();
            case 3 -> handleSearchStudent();
            case 4 -> handleUpdateStudentGrade();
            case 5 -> handleRemoveStudent();
            case 6 -> handleShowBestStudent();
            case 7 -> handleShowLowestStudent();
            case 8 -> handleShowAverageGrade();
            case 9 -> handleShowStudentsAboveAverage();
            case 10 -> handleFinalReport();
            case 0 -> System.out.println("Goodbye!");
        }
    }

    private void handlePrintAllStudents() {
        if (manager.hasNoStudents()) {
            System.out.println("No students.");
            return;
        }

        ArrayList<Student> students = manager.getStudents();

        System.out.println("All students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void handleAddStudent() {
        String name = inputReader.readStudentName();
        int grade = inputReader.readStudentGrade("Enter student grade: ");
        AddStudentResult result = manager.addStudent(name, grade);

        switch (result) {
            case SUCCESS -> System.out.println("Student added.");
            case DUPLICATE_NAME ->  System.out.println("Student with this name already exists.");
            case INVALID_NAME ->   System.out.println("Student name cannot be blank.");
        }
    }

    private void handleSearchStudent() {
        String searchName = inputReader.readStudentName();

        Student foundStudent = manager.findStudentByName(searchName);
        if (foundStudent == null) {
            System.out.println("Student not found.");
            return;
        }
        System.out.println(foundStudent);

    }

    private void handleUpdateStudentGrade() {
        String searchName = inputReader.readStudentName();

        if (manager.findStudentByName(searchName) == null) {
            System.out.println("Student not found.");
            return;
        }

        int newGrade = inputReader.readStudentGrade("Enter new grade: ");
        boolean updated = manager.updateStudentGrade(searchName, newGrade);

        if (updated) {
            System.out.println("Student grade updated.");
        } else {
            System.out.println("Failed to update student.");
        }
    }

    private void handleRemoveStudent() {
        String searchName = inputReader.readStudentName();

        boolean removed = manager.removeStudent(searchName);

        if (removed) {
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private void handleShowBestStudent() {
        Student bestStudent = manager.findBestStudent();

        if (bestStudent == null) {
            System.out.println("No students.");
            return;
        }

        System.out.println("Best student:");
        System.out.println(bestStudent);
    }

    private void handleShowLowestStudent() {
        Student lowestStudent = manager.findLowestStudent();

        if (lowestStudent == null) {
            System.out.println("No students.");
            return;
        }

        System.out.println("Lowest student:");
        System.out.println(lowestStudent);
    }

    private void handleShowTotalGrade() {
        if (manager.hasNoStudents()) {
            System.out.println("No students.");
            return;
        }

        int totalGrade = manager.calculateTotal();
        System.out.println("Total grade: " + totalGrade);

    }
    private void handleShowAverageGrade() {
        if (manager.hasNoStudents()) {
            System.out.println("No students.");
            return;
        }

        double averageGrade = manager.calculateAverage();
        System.out.printf("Average grade: %.2f%n", averageGrade);
    }

    private  void handleShowStudentsAboveAverage() {
        if (manager.hasNoStudents()) {
            System.out.println("No students.");
            return;
        }

        ArrayList<Student> studentsAboveAverage = manager.findStudentsAboveAverage();

        if (studentsAboveAverage.isEmpty()) {
            System.out.println("No students above average.");
            return;
        }

        System.out.println("Students above average:");
        for (Student student : studentsAboveAverage) {
            System.out.println(student);
        }
    }

    private void handleFinalReport() {
        System.out.println("Final report:");
        System.out.println();

        if (manager.hasNoStudents()) {
            System.out.println("No students.");
            return;
        }

        handlePrintAllStudents();
        System.out.println();
        handleShowBestStudent();
        System.out.println();
        handleShowLowestStudent();
        System.out.println();
        handleShowTotalGrade();
        handleShowAverageGrade();
        System.out.println();
        handleShowStudentsAboveAverage();

    }


}
