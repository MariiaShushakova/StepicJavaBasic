package Stepic_module5.Streams_IO;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //FileOutputStream fileOS = null;
        FileWriter fW = null;
        String str = "Java";
        try {
            fW = new FileWriter("E:/1.txt", true);
            fW.write(str);
            //fileOS = new FileOutputStream("E:/1.txt");
            //fileOS.write(str.getBytes()); //записываем Hot в байтах
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fW.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


//        FileInputStream fis = null;
//        int bite = 0;
//
//        try {
//            fis= new FileInputStream("C:/1.txt"); //байтовый поток
//            while((bite=fis.read()) != -1){ //пока не закончено чтение
//                System.out.println((char)bite);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
