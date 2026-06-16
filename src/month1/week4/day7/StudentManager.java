package month1.week4.day7;

import java.util.ArrayList;

public class StudentManager {
    private final ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public boolean hasNoStudents() {
        return students.isEmpty();
    }

    public ArrayList<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public AddStudentResult addStudent(String name, int score) {

        if (name == null || name.isBlank()) {
            return AddStudentResult.INVALID_NAME;
        }

        String normalizedName = name.strip();

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(normalizedName)) {
                return AddStudentResult.DUPLICATE_NAME;
            }
        }

        students.add(new Student(normalizedName, score));
        return AddStudentResult.SUCCESS;

    }

    public boolean updateStudentGrade(String name, int newScore) {
        Student foundStudent = findStudentByName(name);
        if (foundStudent == null) {
            return false;
        }

        foundStudent.setGrade(newScore);
        return true;

    }
    public boolean removeStudent(String name) {
        Student foundStudent = findStudentByName(name);
        if (foundStudent == null) {
            return false;
        }

        students.remove(foundStudent);
        return true;
    }
    public Student findStudentByName(String searchName) {
        if (searchName == null || searchName.isBlank()) {
            return null;
        }

        String normalizedName = searchName.strip();
        for(Student student : students) {
            if(student.getName().equalsIgnoreCase(normalizedName)) {
                return student;
            }
        }
        return null;
    }

    public Student findBestStudent() {
        if (students.isEmpty()) {
            return null;
        }

        Student bestStudent = students.get(0);;

        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getGrade() > bestStudent.getGrade()) {
                bestStudent = students.get(i);
            }
        }
        return bestStudent;
    }
    public Student findLowestStudent() {
        if (students.isEmpty()) {
            return null;
        }

        Student lowestStudent = students.get(0);;

        for (int i = 1; i < students.size(); i++) {

            if (students.get(i).getGrade() < lowestStudent.getGrade()) {
                lowestStudent = students.get(i);
            }
        }
        return lowestStudent;
    }

    public int calculateTotal() {
        int total = 0;

        for (Student student : students) {
            total += student.getGrade();
        }
        return total;
    }
    public double calculateAverage() {
        if (students.isEmpty()) {
            return 0;
        }
        int total = calculateTotal();
        return (double) total / students.size();

    }

    public ArrayList<Student> findStudentsAboveAverage() {

        if (students.isEmpty()) {
            return new ArrayList<>();
        }

        double average = calculateAverage();
        ArrayList<Student> studentsAboveAverage = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade() > average) {
                studentsAboveAverage.add(student);
            }
        }
        return studentsAboveAverage;
    }

}
