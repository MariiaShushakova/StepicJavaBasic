package Stepic_module5.Serialise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject2 {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Nike")};

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("people.bin"); //переводит в байты
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); //чет с файлами

            objectOutputStream.writeObject(people); //записали массив как объект
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
