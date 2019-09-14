package Stepic_module6.Generics.FromJavaRush;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("String 1");
//        list.add("String 2");
        MyListClass list = new MyListClass();
        list.add(100);
        list.add(200);
        list.add("String1");
        list.add("String2");

        Integer sum1 = (Integer) list.getData()[0] + (Integer)list.getData()[1]; //300
        System.out.println(sum1);
        //Integer sum2 = (Integer) list.getData()[2] + (Integer)list.getData()[3];  - ClassCastException

    }
}
