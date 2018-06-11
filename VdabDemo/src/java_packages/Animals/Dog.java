package java_packages.Animals;

public class Dog extends Animal {

    private String color;

    String [] trickList = {"Sit", "Lay down", "Roll", "Bark"};


    public Dog (String name, String color){
        super(name);
        this.color = color;
    }

    @Override
    public void sound() {
        System.out.println("Woef");
    }

    public void bite(){
        System.out.println("Hang");
    }


}
