package Stepic_module5.task2;

import java.io.IOException;
/*
1. прочитали 1-ый байт в 1-ую переменную
2. организуем цикл. Читаем 2-ой байт во 2-ую переменную. Если 1=13 и 2=10, присваиваем 2-ую переменную в первую и пропускаем итерацию
Иначе печатаем 1-ую переменную потом присваиваем 2-ую в 1-ую. И т.д.
3. печатаем 1-ую переменную уже за циклом, если массив был не пустой */

public class Main {
    public static final byte R = 13; // \n
    public static final byte N = 10; // \r
    public static void main(String[] args) throws IOException {
        int var;
        int buffer = System.in.read(); // Читаем байты из потока и присваиваем переменной
        while (buffer != -1) { //пока не закончено чтение
            var = System.in.read(); // Прочитали след. байт
            if (buffer != R || var != N) { // Если не 13 и 10, то записываем в поток buff
                System.out.write(buffer);
            }
            buffer = var; //Делаем текущий байт предыдущим для следующего прохода
        }
        System.out.flush(); //брасывает все, что по-прежнему буферизуется с помощью OutputStream.
    }

}
