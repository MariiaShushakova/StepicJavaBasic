package Stepic_module5.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Создаем объект Scanner по входному потоку System.in
        double result = 0.0; //здесь суммируем
        while (sc.hasNext()) { //Цикл, пока не кончился входной поток
            if (sc.hasNextDouble()) {
                result += sc.nextDouble(); //считываем и плюсуем
            } else {
                sc.next(); //возвращает до пробела
            }
        }
        System.out.printf("%.6f", result);
    }
//        Scanner sc = new Scanner(System.in); //Создаем объект Scanner по входному потоку System.in
//            double result =0; //здесь суммируем
//            while (sc.hasNext()) {//Цикл, пока не кончился входной поток
//                try {
//                    result += Double.parseDouble(sc.next()); //пытаемся считать double, если выходит, то складываем к res если не удастся, то выкинет исключение
//                } catch (NumberFormatException ignored) {
//                }
//        }
//        System.out.format("%.6f", result); //до 6го знака после запятой
    }

