public class Counter {
    public static void main(String[] args) {
        int x  = 1;

        while (x < 6){
            System.out.println(x);

            x++;
            if (x == 6){
                System.out.println("Готово!");
            }
        }

    }
}
