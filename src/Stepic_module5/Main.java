package Stepic_module5;

import Stepic_module5.Serialise.Person;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] bytes= {8,10,32};
        InputStream inputStream = new ByteArrayInputStream(bytes);

        byte[] buff = new byte[2];
        int i;
        while((i = inputStream.read(buff))!= -1){
            System.out.println(i);
            System.out.println(Arrays.toString(buff));
        }





    }
}
