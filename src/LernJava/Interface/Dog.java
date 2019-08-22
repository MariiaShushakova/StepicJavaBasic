package LernJava.Interface;

public class Dog extends AbstractAnimal {
    String type;
    String name;

    public Dog(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("Gav-gav");
    }
}
