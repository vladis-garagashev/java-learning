package month2.week1.day3;

import java.util.HashMap;
import java.util.Map;

public class Day3Final {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();

        students.put("Alex".strip().toLowerCase(), 93);
        students.put(" alex ".strip().toLowerCase(), 100);
        students.put("Bob".strip().toLowerCase(), 75);
        students.put("Kate".strip().toLowerCase(), 90);
        students.put("Maria".strip().toLowerCase(), 85);
        students.put("John".strip().toLowerCase(), 60);


        if(students.containsKey("Alex".strip().toLowerCase())){
            System.out.println("Alex found.");
        } else {
            System.out.println("Alex not found.");
        }
        if(students.containsKey("Mike".strip().toLowerCase())){
            System.out.println("Mike found.");
        } else {
            System.out.println("Mike not found.");
        }

        System.out.println();
        System.out.println("Bob grade: " + students.get("Bob".strip().toLowerCase()));

        Integer removedStudent = students.remove("John".strip().toLowerCase());

        System.out.println();
        if(removedStudent == null) {
            System.out.println("John not found.");

        } else {
            System.out.println("John removed. Grade was: " + removedStudent);
        }

        System.out.println();
        System.out.println("Students count: " + students.size());

        System.out.println();
        System.out.println("All students:");
        for(Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        int total = 0;
        for(Integer value : students.values()) {
            total += value;
        }
        double average = (double) total / students.size();

        System.out.println();
        System.out.println("Total grade: " + total);
        System.out.printf("Average grade: %.2f%n", average);

        String bestStudent = null;
        int bestGrade = 0;
        boolean first = true;

        String lowestStudent = null;
        int lowestGrade = 0;

        for(Map.Entry<String, Integer> entry : students.entrySet()) {

            if(first) {
                bestStudent = entry.getKey();
                lowestStudent = entry.getKey();
                bestGrade = entry.getValue();
                lowestGrade = entry.getValue();
                first = false;
            } else  {
                if(entry.getValue() > bestGrade) {
                    bestStudent = entry.getKey();
                    bestGrade = entry.getValue();
                }
                if(entry.getValue() < lowestGrade) {
                    lowestStudent = entry.getKey();
                    lowestGrade = entry.getValue();
                }
            }

        }

        System.out.println();
        System.out.println("Best student: " + bestStudent + " - " + bestGrade);
        System.out.println("Lowest student: " + lowestStudent + " - " + lowestGrade);


    }
}
