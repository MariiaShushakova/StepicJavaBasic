package Stepic_module6.Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //-------------java5---------------//
        List animals = new ArrayList();
        Animal myAnimal = new Animal();
        animals.add("cat");
        animals.add("dog");//1
        animals.add("rat");
        //animals.add(myAnimal);
        String animal = (String) animals.get(2);//error
        System.out.println(animal);

        //------------Generics---------------//
        List<String> animals2 = new ArrayList<String>();
        animals2.add("racoon");
        animals2.add("dragon");
        animals2.add("mouse");
        //animals2.add(myAnimal); //не String
        String animal2 = animals2.get(1);
    }
}
class Animal {
}
