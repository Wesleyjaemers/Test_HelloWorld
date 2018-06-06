package java_packages.Beehive;

public class Drone {
    String name;
    int charisma;
    int semencount;
    int hitpoints;

    public Drone (String name, int charisma, int semencount, int hitpoints){
        this.name = name;
        this.charisma = charisma;
        this.semencount = semencount;
        this.hitpoints = hitpoints;
    }
    public boolean isDead() {
        return this.hitpoints <= 0;
    }


}
