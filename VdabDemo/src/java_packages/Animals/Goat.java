package java_packages.Animals;

public class Goat extends Animal{

    private boolean melk;
    private String color;


    public Goat(String name, boolean melk, String color) {
        super(name);
        this.melk = melk;
        this.color=color;
    }

    @Override
    public void sound() {
        System.out.println("meeeeh");
    }
}
