public class Fibonacci {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;

        for (int i = 1; i<=20;i++){

            x=x+y;
            y=x+y;
            System.out.print(x + " " + y + " ");

        }

    }
}
