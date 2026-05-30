package month1.week1.day3;

public class Methods4 {

    static int square(int a) {

        return a * a;
    }

    static int square(int a, int b) {
        return  a * b;
    }

    public static void main(String[] args) {
        System.out.println(square(5));
        System.out.println(square(5, 2));
    }
}
