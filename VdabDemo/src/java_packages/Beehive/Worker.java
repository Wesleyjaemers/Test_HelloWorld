package java_packages.Beehive;

public class Worker {
    int capacity = 10;       //class variable
    int load = 0;

    public void gatherNectar(){     //geen static omdat het een instantie is van de objecten.
        for (int i = 0; i < 10 && capacity > load;i++){     //De methode is dus niet globaal beschikbaar (zoals bv. System, Math, ..)
            System.out.println("ga naar volgende bloem "+capacity+" "+load);
            // visit flower
            load +=5;
        }
    }

    public Worker(){        //default constructor
        load = 5;
        capacity = 100;
    }

    public Worker (int initialCapacity, int initialLoad){  // Constructor met 2 parameters
        this.capacity = initialCapacity;
        this.load = initialLoad;
    }

   /* public Worker(int load){  //constructor met 1 parameter
        this.load=load;
        capacity = 100;
    } */

    public Worker (int cap){
        this(cap, 10);   // Constructor die een andere constructor aanspreekt voor de bijkomende parameters
    }

}
