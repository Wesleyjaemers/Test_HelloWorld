package java_packages.Beehive;

public class Queen {
    String name;
    int eggs;
    int mood;
    int danceRes;
    int strength;

    public Queen (String name, int mood, int strength){
        this.name = name;
        this.mood = mood;
        this.strength = strength;
    }

    public void danceOff(Drone d){
        while(eggs==0) {
            if (mood == 100) {
                eggs = d.semencount - ((int) (Math.random() * 100));
                System.out.println("Layed eggs: " + eggs);
            } else {
                danceRes = d.charisma + ((int) (Math.random() * 10));
                if (danceRes >= 10) {
                    this.mood += 10;
                    System.out.println("Dance succesfull, current mood: " + this.mood);
                } else {
                    d.hitpoints -= this.strength;
                    System.out.println("Denied, got smacked. " + d.name + " has " + d.hitpoints + "left");
                }
            }
            if (d.isDead() == true) {
                System.out.println("he dead");
            }
        }
    }




}
