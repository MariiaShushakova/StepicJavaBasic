package LernJava.Interface;

public class Main {
    public static void main(String[] args) {

        Speakable cat = new Cat("Murka");
        cat.speak();
        Speakable dog = new Dog ("Taksa", "Bob");
        dog.speak();

        // Интерфейс не имеет метода getName, необходимо явное приведение
        String name = ((Cat)cat).getName();
        System.out.println(name);

    }
}
