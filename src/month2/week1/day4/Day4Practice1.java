package month2.week1.day4;

import java.util.HashMap;
import java.util.Map;

public class Day4Practice1 {
    public static void main(String[] args) {

        Map<String, Student> students = new HashMap<>();

        addStudent(students, "Alex", 90);
        addStudent(students, "Bob", 75);
        addStudent(students, "Kate", 100);
        addStudent(students, " Alex ", 90);

        System.out.println();
        findStudentByName(students, "Alex");
        findStudentByName(students, "Mike");

        System.out.println();
        updateStudentGrade(students, "Alex", 95);
        removeStudent(students, " BOB ");

        System.out.println();
        printStudents(students);

        System.out.println();
        printAverageGrade(students);
        printBestStudent(students);

        System.out.println();
        printBestStudents(students);

        System.out.println();
        printLowestStudent(students);
        printHasPerfectGrade(students);
        printStudentsCount(students);
    }


    public static void addStudent(Map<String, Student> students, String name, int grade) {
        String normalizedName = name.strip().toLowerCase();
        if(students.containsKey(normalizedName)) {
            System.out.println("Student already exists: " + normalizedName);
        } else  {
            students.put(normalizedName, new Student(name, grade));
            System.out.println("Student added: " + students.get(normalizedName).getInfo());
        }
    }

    public static void findStudentByName(Map<String, Student> students, String searchName) {
        String normalizedSearchName = searchName.strip().toLowerCase();
        Student foundStudent = students.get(normalizedSearchName);

        if (foundStudent != null) {
            System.out.println("Student Found: " + foundStudent.getInfo());

        } else {
            System.out.println("Student not found: " + searchName);
        }
    }

    public static void updateStudentGrade(Map<String, Student> students, String name, int grade) {
        String normalizedName = name.strip().toLowerCase();
        Student studentToUpdate = students.get(normalizedName);
        if (studentToUpdate != null) {
            studentToUpdate.setGrade(grade);
            System.out.println("Grade updated: " + studentToUpdate.getName() + " -> " + studentToUpdate.getGrade());

        } else  {
            System.out.println("Student not found: " + name);
        }
    }

    public static void removeStudent(Map<String, Student> students, String name) {
        if (students.isEmpty()) {
            System.out.println("No students.");
        } else {
            String normalizedName = name.strip().toLowerCase();
            Student removedStudent = students.remove(normalizedName);

            if (removedStudent == null) {
                System.out.println("Student not found: " + name);

            } else {
                System.out.println("Student removed: " + removedStudent.getName());
            }
        }
    }


    public static void printStudents(Map<String, Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students.");
        } else {
            System.out.println("All students:");
            for(Student student : students.values()){
                student.printInfo();
            }
        }
    }

    public static int calculateTotal(Map<String, Student> students) {
        int total = 0;

        for (Student student : students.values()) {
            total += student.getGrade();
        }
        return total;
    }
    public static void printTotal(Map<String, Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students.");
        } else {
            int total = calculateTotal(students);
            System.out.println("Total grade: " + total);
        }
    }

    public static double calculateAverage(Map<String, Student> students) {
        int total = calculateTotal(students);
        return (double) total / students.size();
    }
    public static void printAverageGrade(Map<String, Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students.");
        } else {
            double average = calculateAverage(students);
            System.out.printf("Average score: %.2f%n", average);
        }
    }


    public static Student findBestStudent(Map<String, Student> students) {
        Student bestStudent = null;

        for(Student student : students.values()) {
            if(bestStudent == null){
                bestStudent = student;
            } else if(bestStudent.getGrade() < student.getGrade()) {
                bestStudent = student;
            }
        }

        return bestStudent;
    }
    public static void printBestStudent(Map<String, Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students.");
        } else  {
            Student bestStudent = findBestStudent(students);
            System.out.println("Best student: " + bestStudent.getInfo());
        }
    }

    public static void printBestStudents(Map<String, Student> students) {
        boolean found = false;
        if (students.isEmpty()) {
            System.out.println("No students.");
        } else {
            System.out.println("Excellent students:");
            for(Student student : students.values()) {
                if(student.getGrade() >= 90){
                    student.printInfo();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No excellent students.");
            }
        }

    }

    public static Student findLowestStudent(Map<String, Student> students) {
        Student lowestStudent = null;

        for(Student student : students.values()) {
            if(lowestStudent == null){
                lowestStudent = student;
            }
            else if(lowestStudent.getGrade() > student.getGrade()) {
                lowestStudent = student;
            }
        }
        return lowestStudent;
    }

    public static void printLowestStudent(Map<String, Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students.");
        }  else {
            Student lowestStudent = findLowestStudent(students);
            System.out.println("Lowest student: " + lowestStudent.getInfo());
        }
    }

    public static void printHasPerfectGrade(Map<String, Student> students) {
        boolean hasPerfect = false;

        if (students.isEmpty()) {
            System.out.println("No students.");
        } else {
            for(Student student : students.values()) {
                if(student.getGrade() == 100){
                    hasPerfect = true;
                }
            }
            System.out.println("Has perfect grade: " + hasPerfect);
        }

    }

    public static void printStudentsCount(Map<String, Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students.");
        } else {
            System.out.println("Students count: " + students.size());
        }
    }


}
