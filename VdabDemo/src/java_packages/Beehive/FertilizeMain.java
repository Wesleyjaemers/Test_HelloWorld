package java_packages.Beehive;

public class FertilizeMain {
    public static void main(String[] args) {


        Drone Joske = new Drone("Joske",5,500, 100);
        Drone Adonis = new Drone("Adonis",8,300, 100);
        Drone Josti = new Drone("Josti",2,900, 100);



        Queen Latifa = new Queen ("Latifa",50, 15);
        Queen Cruella = new Queen ("Cruella", 30,25);

        Latifa.danceOff(Adonis);
        Cruella.danceOff(Joske);


    }
}
