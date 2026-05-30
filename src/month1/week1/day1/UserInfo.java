package month1.week1.day1;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String name = scanner.nextLine();
        System.out.println("Сколько тебе лет?");
        int age = scanner.nextInt();
        System.out.println("Привет, " + name);
        System.out.println("Тебе " + age + " лет");
    }
}
