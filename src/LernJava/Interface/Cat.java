package LernJava.Interface;

import java.sql.SQLOutput;

public class Cat extends AbstractAnimal {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    String getName(){
        return name;
    }

    @Override
    public void speak() {
        System.out.println("Mrrrr");
    }

}
