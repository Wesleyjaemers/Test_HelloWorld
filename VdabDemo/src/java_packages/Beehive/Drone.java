package java_packages.Beehive;

public class Drone {
    String name, type;
    int charisma, semencount, hitpoints;

    public Drone (String name, int charisma, int semencount, int hitpoints, String type){
        this.name = name;
        this.charisma = charisma;
        this.semencount = semencount;
        this.hitpoints = hitpoints;
        this.type = type;
    }
    public boolean isDead() {
        return this.hitpoints <= 0;
    }



}
