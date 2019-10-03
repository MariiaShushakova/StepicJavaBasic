package Stepic_module6.Collection.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static java.lang.System.currentTimeMillis;
/** AL = 1 (во всех кейсах);
 *  LL = 1 (для 1го и последнего),
 *  LL = N для середины */

public class TestListGet {
    static int LIST_LENGTH = 100000;
    static int OPERATION_COUNT = 100000; //кол-во раз сколько выолню операцию

    public static void main(String[] args) {
        int elemIndex = LIST_LENGTH/2; //какой элемент читаем из list
        List<String> list = new ArrayList<>(); // ArrayList/LinkedList

        //создаю 100000й лист
        for(int k=0; k<LIST_LENGTH; k++){
            list.add("A");
        }

        //test
        long startTime = currentTimeMillis();
        for (int k = 0; k < OPERATION_COUNT ; k++) {
            list.get(elemIndex); //100000раз читаю элемент (elemIndex)
        }
        long stopTime = currentTimeMillis();
        System.out.println("dT" + (stopTime - startTime));
    }
}
