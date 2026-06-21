package month2.week1.day2;


import month1.week4.day7.Student;

import java.util.HashSet;
import java.util.Set;

public class Day2Practice1 {
    public static void main(String[] args) {
        // Практика 1

//        Set<String> names = new HashSet<>();
//
//        System.out.println("Add Alex: " + names.add("Alex"));
//        System.out.println("Add Bob: " + names.add("Bob"));
//        System.out.println("Add Alex: " + names.add("Alex"));
//        System.out.println("Add Kate: " + names.add("Kate"));
//        System.out.println("Add Bob: " + names.add("Bob"));
//        System.out.println("Add Mike: " + names.add("Mike"));
//
//        System.out.println();
//        System.out.println("Unique names count: " + names.size() );
//
//        System.out.println();
//        if(names.contains("Alex")) {
//            System.out.println("Alex found.");
//        } else  {
//            System.out.println("Alex not found.");
//        }
//        if(names.contains("John ")) {
//            System.out.println("John  found.");
//        } else {
//            System.out.println("John  not found.");
//        }
//
//        System.out.println();
//        System.out.println("All unique names:");
//        for (String name : names) {
//            System.out.println(name);
//        }

        // Практика 2
//        Set<String> names1 = new HashSet<>();
//        names1.add("Alex");
//        names1.add("alex");
//        names1.add(" ALEX ");
//        names1.add("Bob");
//        names1.add("bob");
//
//        System.out.println("Without normalization:");
//        System.out.println("Unique names count: " + names1.size());
//
//        Set<String> names2 = new HashSet<>();
//
//        System.out.println();
//        System.out.println("With normalization:");
//        System.out.println("Add Alex: " + names2.add("Alex".strip().toLowerCase()));
//        System.out.println("Add alex: " + names2.add("alex".strip().toLowerCase()));
//        System.out.println("Add  ALEX : " + names2.add(" ALEX ".strip().toLowerCase()));
//        System.out.println("Add Bob: " + names2.add("Bob".strip().toLowerCase()));
//        System.out.println("Add  bob : " + names2.add(" bob ".strip().toLowerCase()));
//        System.out.println("Unique names count: " + names2.size());

        //Практика 3  и 4

//        Set<String> emails = new HashSet<>();
//
//        String[] emailList = {"alex@mail.com",
//                "bob@mail.com",
//                " ALEX@mail.com ",
//                "kate@mail.com",
//                "bob@mail.com",
//                "MIKE@mail.com",
//                " mike@mail.com "};
//
//        System.out.println("Email registration with loop:");
//        System.out.println();
//
//        for (String email : emailList) {
//            if(emails.add(email.strip().toLowerCase())) {
//                System.out.println("Registered: " + email);
//            } else  {
//                System.out.println("Duplicate email: " + email);
//            }
//        }
//
//        System.out.println();
//        System.out.println("Unique emails count: " + emails.size());

        String[] names = {
                "Alex",
                "Bob",
                " alex ",
                "Kate",
                "BOB",
                "Mike",
                " mike ",
                "John"
        };
        Set<String> studentNames = new HashSet<>();

        System.out.println("Student registration:");
        System.out.println();

        for (String name : names) {
            if (studentNames.add(name.strip().toLowerCase())) {
                System.out.println("Registered student: " + name);
            }  else {
                System.out.println("Duplicate student name: " + name);
            }
        }

        System.out.println();
        System.out.println("Unique students count: "  + studentNames.size());
        System.out.println();
        System.out.println("Normalized unique names:");
        for (String student : studentNames) {
            System.out.println(student);
        }
    }
}
