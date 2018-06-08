package java_packages.Animals;

import java_packages.Theorie.Random;

import java.util.Scanner;

public class ZooMain {
    public static void main(String[] args) {

        Scanner inputAnimal = new Scanner(System.in);

        Animal [] animalList = { new Cat ("Jos"),
                                new Cat("Kat"),
                                new Dog("Whitey", "Black"),
                                new Lion("Simba",70),
                                new Rabbit("Flappie",false),
                                new Cat ("Ludo"),
                                new Lion("Ebert",40),
                                new Rabbit("Joker", false),
                                new Dog("Blackie", "white"),
                                new Lion("Wannabe", 10)
        };

        for (int i=0;i<animalList.length;i++) {
            animalList[Random.berekenRandomGetal(0,9)].sound();  // methode uit een ander package
        }

        switch (inputAnimal.nextInt()){
            case 1: Cat c = new Cat ("Kitty");
            break;

            case 2: Dog d = new Dog ("Blackie","Black");
            break;

            case 3: Lion l = new Lion ("Simba", 60);
            break;

            case 4: Rabbit r = new Rabbit ("Flappie", false);
            break;

            case 5: Goat g = new Goat ("Trudy", true, "Zwart/wit gevlekt");
        }

        /*if(r1.isFluffy()){
            System.out.println(r1.name+" is a very fluffy rabbit");
        }else{
            System.out.println("You no real rabbit");
        }*/


    }
}
