import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько тебе лет?");
        int age = scanner.nextInt();

        if (age >= 18){
            System.out.println("Ты совершеннолетний");
        }
        else if (age < 0 ){
            System.out.println("Ошибка");
        }
        else {
            System.out.println("Ты несовершеннолетний");
        }
    }
}