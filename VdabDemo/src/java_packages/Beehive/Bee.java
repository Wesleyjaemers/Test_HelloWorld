package java_packages.Beehive;

public class Bee {

    protected String name;
    //private String name;

    public Bee(){
        this.name = "Default";
    }

    public Bee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fly(){
        System.out.println("Bee "+name+" is flying awaaaaaay");
    }
}
