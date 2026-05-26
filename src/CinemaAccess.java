import java.util.Scanner;

public class CinemaAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Твой возраст");
        int age = scanner.nextInt();

        if (age < 0){
            System.out.println("Ошибка");

        } else if (age >= 18) {
            System.out.println("Вход разрешен");
        }else {
            System.out.println("Есть ли рядом взрослый?");
            boolean isGrounHere = scanner.nextBoolean();

            if (isGrounHere) {
                System.out.println("Вход разрешён со взрослым");
            }
            else {
                System.out.println("Вход запрещен");
            }

        }
    }
}
