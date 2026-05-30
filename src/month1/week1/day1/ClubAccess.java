package month1.week1.day1;

import java.util.Scanner;

public class ClubAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Твой возраст");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Есть ли билет?");
        boolean hasTicket = scanner.nextBoolean();

        if (age < 0 ){
            System.out.println("Ошибка");
        } else if (age >= 18 && hasTicket) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }
    }
}
