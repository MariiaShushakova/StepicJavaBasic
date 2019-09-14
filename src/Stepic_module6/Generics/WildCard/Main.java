package Stepic_module6.Generics.WildCard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimals);
        test(listOfDogs);
    }
    private static void test (List<? extends Animal> list){ //WildCard list Animal его наследников
        for (Animal animal:list){
            animal.eat();
        }
    }
}
