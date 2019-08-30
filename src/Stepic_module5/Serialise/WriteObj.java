package Stepic_module5.Serialise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObj {
    public static void main(String[] args) {
//        Person person1 = new Person(1, "Bob");
//        Person person2 = new Person(2, "Mike");
        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Nike")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin"); //переводит в байты
            ObjectOutputStream oos = new ObjectOutputStream(fos); //чет с файлами
//            oos.writeObject(person1); //записываем объекты по одному
//            oos.writeObject(person2);

            //способ1 (записать массив из объектов)
            oos.writeInt(people.length);
            for (Person person : people){
                oos.writeObject(person);
            }


            oos.close(); //выходной поток надо закрывать
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
