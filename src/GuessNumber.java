import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secret = random.nextInt(10) + 1;
        int guesses = 1;

        System.out.println("=== Игра: Угадай число ===");
        System.out.println("У тебя есть 3 попытки");

        while (guesses <= 3) {
            System.out.println("Попытка " + guesses + ". Введи чеисло: ");
            int myNum = scanner.nextInt();

            if (myNum < 1 || myNum > 10) {
                System.out.println("Число должно быть от 1 до 10");
                continue;
            }
            else if (myNum == secret){
                System.out.println("Поздравляю!");
                break;
            }
            else {
                if (guesses < 3) {
                    if (myNum > secret) {
                        System.out.println("Меньше!");
                    } else {
                        System.out.println("Больше!");
                    }
                        System.out.println("Попробуй ещё");
                }
                else {
                    System.out.println("Ты проиграл, я загадал число " + secret);
                }
            }
            guesses ++;
        }

        System.out.println("Игра окончена");

    }
}
