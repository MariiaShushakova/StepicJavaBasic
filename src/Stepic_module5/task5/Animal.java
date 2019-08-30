package Stepic_module5.task5;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof Animal) {
            result = Objects.equals(name, ((Animal) obj).name);
        }
        return result;
    }

    @Override
    public String toString() {
        return "name: " + name;
    }

    /**
     * Метод из переданного массива байт восстанавливает массив объектов Animal.
     * Массив байт устроен следующим образом: Сначала идет число типа int,
     * записанное при помощи ObjectOutputStream.writeInt(size).
     * Далее подряд записано указанное количество объектов типа Animal,
     * сериализованных при помощи ObjectOutputStream.writeObject(animal).
     * Если вдруг массив байт не является корректным представлением массива
     * экземпляров Animal, то метод должен бросить исключение java.lang.IllegalArgumentException.
     *
     * @param data - byte[];
     * @return Animal[] - Animal.
     */
    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(data))) { //try-with-resources
            int count = in.readInt(); // считываем число массива
            Animal[] animals = new Animal[count]; //создаем массив из animals
            for (int i = 0; i < count; i++)//для 1го объекта (из массива animal) читаем объет и кастим его к Animal
                animals[i] = (Animal) in.readObject();
            return animals;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }

    }
}

