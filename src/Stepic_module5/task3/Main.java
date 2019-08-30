package Stepic_module5.task3;

import java.io.*;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        byte[] data = {48, 49, 50, 51};
        Charset charset = Charset.forName("UTF-8"); //Charset.defaultCharset();
        InputStream is = new ByteArrayInputStream(data);

        try {
            System.out.println(readAsString(is, charset));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        int buffer;
        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder stringBuilder = new StringBuilder();

        while ((buffer = reader.read()) != -1) { //пока идет чтение
            stringBuilder.append((char) buffer); //обновляет значение strringBuilder
        }
        return stringBuilder.toString();
    }
}
