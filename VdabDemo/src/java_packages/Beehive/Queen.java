package java_packages.Beehive;

public class Queen {
    String name, type;
    int eggs, mood, danceRes, strength, countWin, countLoss;

    public Queen (String name, int mood, int strength, String type){
        this.name = name;
        this.mood = mood;
        this.strength = strength;
        this.type = type;
    }

    public void danceOff(Drone d){
        while(eggs==0 && !d.isDead()) {
            if (this.mood >= 100) {
                eggs = d.semencount - ((int) (Math.random() * 100));
                System.out.println("\n The results");
                System.out.println("-------------");
                System.out.println("\n"+d.name+" has made the Queen very happy after "+countWin+" times");
                System.out.println("Queen "+this.name+" layed "+eggs+" eggs");
            } else {
                danceRes = d.charisma + ((int) (Math.random() * 10));
                if (danceRes >= 10) {
                    this.mood += 10;
                    if (this.mood>100){
                        this.mood=100;
                    }
                    System.out.println("Dance succesfull, current mood: " + this.mood);
                    countWin++;
                } else {
                    d.hitpoints -= this.strength;
                    if(d.hitpoints<0){
                        d.hitpoints = 0;
                    }
                    System.out.println("Denied. Not impressed, got smacked. " + d.name + " has " + d.hitpoints + "left");
                    countLoss++;
                }
            }
            if (d.isDead()) {
                System.out.println("He dead. Tried "+countLoss+" times");
            }
        }
    }




}
