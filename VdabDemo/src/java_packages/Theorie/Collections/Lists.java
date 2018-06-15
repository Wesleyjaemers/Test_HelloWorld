package java_packages.Theorie.Collections;

import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {

        ArrayList getallen = new ArrayList(); // hoeft op voorhand geen dimensie mee te krijgen
        getallen.add(15);
        getallen.add(10);
        getallen.add(3);
        getallen.add(2);
        getallen.add(2,56); // voegt 56 toe op positie 2, de rest schuift op

        System.out.println(getallen.size());
        System.out.println(getallen.get(0));
        getallen.set (3, 8); // het cijfer op index positie '3' wordt vervangen door '8'
        System.out.println(getallen.contains(3)); // geeft weer of de waarde in de List zit

    }
}
