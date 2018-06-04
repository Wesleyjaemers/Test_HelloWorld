package java_packages.Beehive;

public class MainHive {
    public static void main(String[] args) {

        Worker maja = new Worker(100,10);
        Worker willy = new Worker(130,5);
        // Worker jos = new Worker(15);
        Worker magda = new Worker(); // default constructor

        maja.gatherNectar();

        Soldier arnold = new Soldier();
        Soldier sylvester = new Soldier();



if(sylvester.hitpoints>0) {
    while (sylvester.isDead() == false) {

        arnold.attack(sylvester);
    }
    System.out.println("He dead");
}

            //sylvester.defend(arnold);
        }

    }

