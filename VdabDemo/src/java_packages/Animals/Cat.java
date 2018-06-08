package java_packages.Animals;

public class Cat extends Animal {

    private int lives = 9;

    public Cat(){

    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Miauw");
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
