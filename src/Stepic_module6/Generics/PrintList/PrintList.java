package Stepic_module6.Generics.PrintList;

import java.util.ArrayList;

/**Создать класс со списком объектов произвольной природы (любой класс). Класс включает в себя метод, который называется PrintList с логическим параметром. Метод выводит на консоль нечетные или четные элементы списка, взависимости от величины параметра (true или false). */
public class PrintList <T> { //1.Строим обобщенный класс
    private ArrayList<T> list = null; //2.Объявляем ArrayList c параметрическим типом (создаем список)

    public PrintList() {
        list = new ArrayList<T>();
    }

    public void add(T data){ //3.Создаем метод, заполняющий список данными
        list.add(data);
    }
    public void printList(boolean isOdd){
        int size = list.size();
        if(isOdd){
            for (int i = 0; i < size ; i=+2) {
                System.out.println(list.get(i).toString());
            }
        }else{
            for (int i = 0; i < size ; i=+2) {
                System.out.println(list.get(i).toString());
            }
        }
    }

}


