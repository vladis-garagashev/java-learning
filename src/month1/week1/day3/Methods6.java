package month1.week1.day3;

public class Methods6 {
    static int minusTwo(int x){
        return x - 2;
    }

    static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        int result = square(minusTwo(8));
        System.out.println(result);
    }
}
