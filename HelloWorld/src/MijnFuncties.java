import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MijnFuncties {
    public static void main(String[] args) {

        /*double a = 1;
        int b = 2;

        double berekening = a/b;

        System.out.println(Math.round(berekening));
        DecimalFormat mijnFormaat = new DecimalFormat("#0.00");
        System.out.println(mijnFormaat.format(berekening)); */

        System.out.println("Geef je naam in: ");
        Scanner userInput = new Scanner(System.in);
        String userName = userInput.nextLine();
        System.out.println("geef je geboortedatum: ");
        int userDate = userInput.nextInt();
        System.out.println("Hello " + userName + " , dickhead. Je ben te oud, kijk maar: " + (2018 - userDate));

        /*String myString =  "Dit is een lange tekst de hier alleen maar staat om oefeningen op te maken";
        System.out.println (myString.toUpperCase());
        System.out.println(myString.substring(52, 62)); */

    }
}
