package month1.week1.day3;

public class Scope2 {

    static void addTen(int number) {
        number = number + 10;

    }

    public static void main(String[] args) {
        int value = 20;

        addTen(value);

        System.out.println(value);
    }
}
