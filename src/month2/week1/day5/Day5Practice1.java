package month2.week1.day5;

import java.util.*;

public class Day5Practice1 {
    public static void main(String[] args) {

        List<String> students1 = new ArrayList<>();
        students1.add("Alex");
        students1.add("Bob");
        students1.add("Alex");
        students1.add("Kate");

        System.out.println("=== LIST: Course visits ===");
        for(String student: students1){
            System.out.println(student);
        }
        System.out.println();
        System.out.println("Why List? Order matters and duplicates are allowed.");

        Set<String> students2 = new HashSet<>();
        students2.add("Alex");
        students2.add("Bob");
        students2.add("Alex");
        students2.add("Kate");

        System.out.println();
        System.out.println("=== SET: Unique students ===");
        for(String student: students2){
            System.out.println(student);
        }
        System.out.println();
        System.out.println("Why Set? Each student name should appear only once.");

        Map<String, Integer> students3 = new HashMap<>();
        students3.put("alex ", 90);
        students3.put("bob", 75);
        students3.put("kate", 100);
        students3.put("john", 60);

        System.out.println();
        System.out.println("=== MAP: Student grades ===");
        for(Map.Entry<String, Integer> entry: students3.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();
        System.out.println("Why Map? We need to find grade by student name.");

        System.out.println();
        System.out.println("=== KEYS ===");
        for(String student: students3.keySet()){
            System.out.println(student);
        }

        System.out.println();
        System.out.println("=== VALUES ===");
        for(Integer grade: students3.values()){
            System.out.println(grade);
        }

        System.out.println();
        System.out.println("=== ENTRIES  ===");
        for(Map.Entry<String, Integer> student: students3.entrySet()){
            System.out.println(student.getKey() + " -> " + student.getValue());
        }

        int total = 0;
        for(Integer grade: students3.values()){
            total += grade;
        }
        double average = (double) total / students3.size();

        System.out.println();
        System.out.printf("Average grade: %.2f\n", average);

        System.out.println();
        System.out.println("Excellent students:");
        for(Map.Entry<String, Integer> entry: students3.entrySet()){

            if(entry.getValue() >= 90){
                System.out.println(entry.getKey() + ": " + entry.getValue());

            }
        }
    }
}
