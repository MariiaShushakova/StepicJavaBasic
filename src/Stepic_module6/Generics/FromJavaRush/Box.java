package Stepic_module6.Generics.FromJavaRush;

public class Box <T> {
    private T temp;

    public void set (T temp){
        this.temp = temp;
    }
    public T getTemp(){
        return temp;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();

        stringBox.set("Старая строка");
        System.out.println(stringBox.getTemp());
        stringBox.set("Новая строка");
        System.out.println(stringBox.getTemp());

        //stringBox.set(12345); error
    }
}
