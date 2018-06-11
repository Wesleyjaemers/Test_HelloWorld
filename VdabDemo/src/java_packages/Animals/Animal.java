package java_packages.Animals;

public abstract class Animal {

    protected String name;


    public Animal (){

    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sound(); // het uitvoeren van de methode gaat bepaald worden door de subclass
}
