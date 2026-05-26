import java.util.Scanner;

public class MiniProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Как тебя зовут?");
        String name = scanner.nextLine();

        System.out.println("Сколько тебе лет?");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Какое твое любимое занятие?");
        String hobby = scanner.nextLine();

        System.out.println("Привет, " + name);
        System.out.println("Тебе " + age + " лет");
        System.out.println("Ты любишь " + hobby);

    }
}
