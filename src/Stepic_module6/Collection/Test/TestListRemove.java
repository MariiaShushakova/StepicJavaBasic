package Stepic_module6.Collection.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static java.lang.System.currentTimeMillis;

public class TestListRemove {
    static int LIST_LENGTH = 100000;
    static int OPERATION_COUNT = 100000; //кол-во раз сколько выолню операцию

    public static void main(String[] args) {
        int elemIndex = LIST_LENGTH-1; //поледний элемент читаем из list
        List<String> list = new LinkedList<>(); // ArrayList/LinkedList

        //создаю 100000й лист
        for(int k=0; k<LIST_LENGTH; k++){
            list.add("A");
        }

        //test
        long startTime = currentTimeMillis();
        for (int k = 0; k < OPERATION_COUNT ; k++) {
            list.remove(elemIndex-k); //100000раз удаляю элемент (elemIndex)
        }
        long stopTime = currentTimeMillis();
        System.out.println("dT" + (stopTime - startTime));
    }
}
