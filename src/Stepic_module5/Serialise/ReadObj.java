package Stepic_module5.Serialise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObj {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int personCount = ois.readInt(); //число массива
            Person[] people = new Person[personCount]; // создаем массив из person's
            for (int i = 0; i< personCount; i++) {
                people[i] = (Person) ois.readObject(); //для 1го объекта (из массива people) читаем объет и кастим его к Person
            }
            System.out.println(Arrays.toString(people));
//            Person person1 = (Person)ois.readObject(); // приводим object to person
//            System.out.println(person1);
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) { //если не будет класса person
            e.printStackTrace();
        }

    }
}
