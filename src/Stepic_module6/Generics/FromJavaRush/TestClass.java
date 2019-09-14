package Stepic_module6.Generics.FromJavaRush;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static <T> void fill(List<T> list, T val){
        for (int i = 0; i < list.size(); i++) {
            list.set(i,val);
        }
    }
    public static void main(String[] args) {
        List <String> strings = new ArrayList<>();
        strings.add("str1");
        strings.add("str2");

        fill(strings,"new str");
        System.out.println(strings); //[new str, new str]

        List<Integer> numbers = new ArrayList<>();
        numbers.add(111);
        numbers.add(222);
        numbers.add(333);
        fill(numbers, 444);
        System.out.println(numbers);

    }
}
