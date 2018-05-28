public class HelloWorld {

    public static void main(String[] args) {

        char mychar = 'A';
        String myName = "Joske";

        float dagloon = 100;
        int aantalKinderen = 1;
        double aantalDagen = 20;
        double perKind = 50;
        double treinabonnement = 180;
        double bruto = dagloon * aantalDagen;
        double kindgeld = aantalKinderen * perKind;
        double nettoloon;
        boolean bedrijfswagen = false;

        nettoloon = bruto + kindgeld;

        if (bedrijfswagen == false){

            nettoloon = nettoloon + treinabonnement;

        }

        System.out.println("Uw nettoloon bedraagt: " + nettoloon);



    }
}
