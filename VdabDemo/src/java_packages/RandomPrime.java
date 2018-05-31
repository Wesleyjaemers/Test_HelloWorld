package java_packages;

import java.util.Scanner;

public class RandomPrime {

    public static int berekenRandom(int min, int max){
        int rand;
        rand =(int)(min+Math.random()*((max+1)-min));
        return rand;
    }

    public static boolean isPrime(int a) {
        int rest;
        boolean priem = true;

        for (int i = 2; i < a; i++) {

            rest = a % i;
            if (rest == 0) {
                priem = false;
            }
        }
        return priem;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Geef Min op: ");
        int min = input.nextInt();          // rood bolletje is een break voor de Debug, rechtsklik om condition toe te voegen
        System.out.println("Geef Max op: ");
        int max = input.nextInt();

        int tussenRes = berekenRandom(min, max);
        boolean res = isPrime(tussenRes);

        System.out.println("Random getal = "+tussenRes);
        if (res==false)
            System.out.println("getal is geen priem");

        else
            System.out.println("getal is een priem");

    }
}
