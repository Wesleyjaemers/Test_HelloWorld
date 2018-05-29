package java_packages;

import java.util.Scanner;

public class Object {
    public static void main(String[] args) {

        String naam = "Joskeuh Vermeulen";
        String naam2 = new String ("Joskeuh");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een getal op:");
        int j = scanner.nextInt();
        System.out.println("res= "+ j*2);

        System.out.println(naam.toUpperCase());

        //Substring
        int i = naam.indexOf(' ');
         String firstName = naam.substring(0, i);

         //

    }
}
