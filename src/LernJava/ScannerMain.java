package LernJava;
import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите переменную:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Число " + number);
        } else if (sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println("Строка " + line);
        }
        else {
            System.out.println("Извините, это что-то странное. Перезапустите программу и попробуйте снова!");
        }
        sc.close();
    }
}
