package month2.week1.day3;

import month1.week4.day7.Student;

import java.util.HashMap;
import java.util.Map;

public class Day3Practice1 {
    public static void main(String[] args) {

//        Map<String,Integer> students = new HashMap<>();
//
//        students.put("Alex",80);
//        students.put("Bob",75);
//        students.put("Kate",90);
//        students.put("John",60);
//
//        students.put("Alex",100);
//
//        if(students.containsKey("Alex")){
//            System.out.println("Alex found.");
//        } else {
//            System.out.println("Alex not found.");
//        }
//
//        if(students.containsKey("Mike")){
//            System.out.println("Mike found.");
//        } else {
//            System.out.println("Mike not found.");
//        }
//
//        System.out.println();
//        System.out.println("Students count: " + students.size());
//        System.out.println();
//        System.out.println("All students:");
//
//        for(Map.Entry<String, Integer> entry: students.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//
//        System.out.println();
//        System.out.println("Bob grade: " + students.get("Bob"));
//
//        Integer removedGrade = students.remove("John");
//
//        System.out.println();
//        if(removedGrade == null){
//            System.out.println("John not found.");
//        }  else  {
//            System.out.println("John removed. Grade was: " + removedGrade);
//        }
//
//        Integer removedGrade2 = students.remove("Mike");
//
//        System.out.println();
//        if(removedGrade2 == null){
//            System.out.println("Mike not found.");
//        }  else  {
//            System.out.println("Mike removed. Grade was: " + removedGrade2);
//        }
//
//        System.out.println();
//        System.out.println("Students count after remove: " + students.size());
//
//        System.out.println();
//        System.out.println("All students after remove:");
//        for(Map.Entry<String, Integer> entry: students.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//
//        int total = 0;
//        for(Map.Entry<String, Integer> entry: students.entrySet()) {
//            total += entry.getValue();
//        }
//
//        double average = (double )total / students.size();
//
//
//        System.out.println();
//        System.out.println("Total grade: " + total);
//        System.out.printf("Average grade: %.2f%n", average);
//
//
//        Map<String, Integer> normalizedStudents = new HashMap<>();
//
//        normalizedStudents.put("Alex".strip().toLowerCase(),100);
//        normalizedStudents.put(" alex ".strip().toLowerCase(),100);
//        normalizedStudents.put("ALEX".strip().toLowerCase(),100);
//        normalizedStudents.put("Bob".strip().toLowerCase(),80);
//
//        System.out.println();
//        System.out.println("Normalized students count: " + normalizedStudents.size());
//        System.out.println();
//        System.out.println("Normalized students:");
//        for(Map.Entry<String, Integer> entry: normalizedStudents.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

        Map<String, Integer> productPrices = new HashMap<>();

        productPrices.put("Laptop".strip().toLowerCase(), 1200);
        productPrices.put("Phone".strip().toLowerCase(), 800);
        productPrices.put("Mouse".strip().toLowerCase(), 35);
        productPrices.put("MOUSE".strip().toLowerCase(), 30);
        productPrices.put("Monitor".strip().toLowerCase(), 300);


        if(productPrices.containsKey("Mouse".strip().toLowerCase())){
            System.out.println("Mouse found.");
        } else {
            System.out.println("Mouse not found.");
        }
        if(productPrices.containsKey("Keyboard".strip().toLowerCase())){
            System.out.println("Keyboard found.");
        } else {
            System.out.println("Keyboard not found.");
        }

        System.out.println();
        System.out.println("Laptop price: " + productPrices.get("Laptop".strip().toLowerCase()));

        Integer removedProduct = productPrices.remove("Phone".strip().toLowerCase());

        System.out.println();
        if(removedProduct == null){
            System.out.println("Phone not found.");
        }  else  {
            System.out.println("Phone removed. Price was: " + removedProduct);
        }

        System.out.println();
        System.out.println("Products count: " + productPrices.size());

        System.out.println();
        System.out.println("All products:");
        for(Map.Entry<String, Integer> entry : productPrices.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        int total = 0;
        for(Map.Entry<String, Integer> entry : productPrices.entrySet()){
            total += entry.getValue();
        }
        System.out.println();
        System.out.println("Total price: " + total);
    }
}
