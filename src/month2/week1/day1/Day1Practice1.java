package month2.week1.day1;

import java.util.ArrayList;
import java.util.List;

public class Day1Practice1 {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        List<Integer> grades = new ArrayList<>();

        students.add("Alex");
        students.add("Bob");
        students.add("Kate");
        students.add("Alex");
        grades.add(90);
        grades.add(75);
        grades.add(100);
        grades.add(60);

        System.out.println("First student: " + students.get(0));
        System.out.println();


        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).equals("Bob")) {
                students.set(i, "John");
            }
            else if(students.get(i).equals("Kate")) {
                students.remove(i);
            }
        }

        System.out.println("After changes:");
        for(String student: students) {
            System.out.println(student);
        }

        System.out.println("Students count: " + students.size());
        System.out.println();

        if (students.contains("Alex")) {
            System.out.println("Alex found.");
        } else {
            System.out.println("Alex not found.");
        }

        if (students.contains("Mike")) {
            System.out.println("Mike found.");
        } else {
            System.out.println("Mike not found.");
        }
        System.out.println();

        System.out.println("Grades:");
        for(Integer grade : grades) {
            System.out.println(grade);
        }

        int total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        System.out.println();
        System.out.println("Total grade: " + total);

        double average = (double) total /  grades.size();
        System.out.printf("Average grade: %.2f%n", average);

        if (grades.contains(100)){
            System.out.println("Grade 100 found.");
        } else {
            System.out.println("Grade 100 not found.");
        }
        if (grades.contains(50)){
            System.out.println("Grade 50 found.");
        } else {
            System.out.println("Grade 50 not found.");
        }

    }
}
