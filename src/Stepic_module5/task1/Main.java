package Stepic_module5.task1;

import java.io.*;
/* Напишите метод, читающий входной поток и вычисляющий контрольную сумму прочитанных данных.

Контрольная сумма данных вычисляется по следующему алгоритму:

Контрольная сумма представляет собой число типа int. Контрольная сумма пустого набора данных равна нулю.
Контрольная сумма непустого набора данных вычисляется по следующей рекуррентной формуле: Cn+1=rotateLeft(Cn) xor bn+1 , где Cn — контрольная сумма первых n байт данных, rotateLeft — циклический сдвиг бит числа на один бит влево (чтобы не изобретать велосипед, используйте Integer.rotateLeft), bn — n-ный байт данных.
Поскольку метод не открывал данный InputStream, то и закрывать его он не должен. Выброшенное из методов InputStream исключение должно выбрасываться из метода.*/

public class Main {
    public static void main(String[] args) {
        byte[] input = {0x33, 0x45, 0x01}; //{0011 0011, 0100 0101, 0000 0001} 51, 69, 1
        InputStream inputStream = new ByteArrayInputStream(input);
        try {
            System.out.println(checkSumOfStream(inputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //C[n+1] = rotateLeft(C[n]) xor b[n+1]
    /*C1 = rotateLeft(C0) xor b1 = 0000 0000 xor 0011 0011 = 0011 0011 = 51dec;
C2 = rotateLeft(C1) xor b2 = 0110 0110 xor 0100 0101 = 0010 0011 = 35dec;
C3 = rotateLeft(C2) xor b3 = 0100 0110 xor 0000 0001 = 0100 0111 = 71dec;*/
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int var;
        int controlSum = 0;
        while ((var = inputStream.read()) != -1) { //пока не закончено чтение
            controlSum = Integer.rotateLeft(controlSum, 1) ^ var; // rotateLeft — циклический сдвиг бит числа на один бит влево
            //Бинарный оператор XOR копирует бит, если он установлен в одном операнде, но не в обоих.

        }
        return controlSum;
    }
}
