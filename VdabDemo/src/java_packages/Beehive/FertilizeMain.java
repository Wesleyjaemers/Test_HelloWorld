package java_packages.Beehive;

import java.util.Scanner;

public class FertilizeMain {
    public static void main(String[] args) {

        Scanner inputDrone = new Scanner(System.in);
        Scanner inputQueen = new Scanner (System.in);

        Drone Joske = new Drone("Joske",5,500, 100);
        Drone Adonis = new Drone("Adonis",8,300, 100);
        Drone Josti = new Drone("Josti",2,900, 100);

        Drone [] droneList = new Drone[3];
        droneList[0]= Joske;
        droneList[1]= Adonis;
        droneList[2]= Josti;

        Queen Latifa = new Queen ("Latifa",50, 15);
        Queen Cruella = new Queen ("Cruella", 30,25);

        Queen [] queenList = new Queen [2];
        queenList [0] = Latifa;
        queenList [1] = Cruella;

        System.out.println("The brave ones: ");
        System.out.println(droneList[0].name);
        System.out.println(droneList[1].name);
        System.out.println(droneList[2].name);
        System.out.println("Choose your drone (1-3)");

        int indexDrone = inputDrone.nextInt()-1;

        System.out.println("The Queens");
        System.out.println(queenList[0].name);
        System.out.println(queenList[1].name);
        System.out.println("Choose queen to impress (1-2)");

        int indexQueen = inputQueen.nextInt()-1;

        queenList [indexQueen].danceOff(droneList[indexDrone]);

        //Latifa.danceOff(Adonis);
        //Cruella.danceOff(Joske);


    }
}
