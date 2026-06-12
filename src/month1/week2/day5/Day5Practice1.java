package month1.week2.day5;

import java.util.ArrayList;

public class Day5Practice1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();

        addPlayer(names, scores, "Alex", 80);
        addPlayer(names, scores, "Bob", 95);
        addPlayer(names, scores, "John", 70);

        updateScore(scores, 1, 100);

        names.remove(2);
        scores.remove(2);
        addPlayer(names, scores, "Mike", 90);


        printPlayers(names, scores);

    }

    public static void printPlayers(ArrayList<String> names, ArrayList<Integer> scores) {
        System.out.println("Players:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " - " + scores.get(i));
        }
    }

    public static void addPlayer(ArrayList<String> names, ArrayList<Integer> scores, String name, int score) {
        names.add(name);
        scores.add(score);
    }

    public static void updateScore(ArrayList<Integer> scores, int index, int newScore){
        scores.set(index, newScore);
    }




}
