package java_packages;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        double input;
        double round;
        double rest;
         Scanner Prime = new Scanner(System.in);

        System.out.println("Geef getal op: ");
        int a = Prime.nextInt();
        a = (int)Math.sqrt(a);

        for (int b=2;b<a;b++){
            input = a / b;
            round = Math.round(input);
            rest = input - round;
           if (rest==0){
               System.out.println("Getal is geen priemgetal");
           }
            System.out.println("Getal is een priemgetal");
        }

    }
}
