package Stepic_module6.Generics.FromJavaRush;

public class Test<T> {
    private T value1;
    private T value2;

    public void printValues(){
        System.out.println(value1);
        System.out.println(value2);
    }
    public static <T> Test<T> createAndAdd2Values (Object o1, Object o2){
        Test<T> result = new Test<>();
        result.value1 = (T) o1;
        result.value2 = (T) o2;
        return  result;
    }

    public static void main(String[] args) {
        Double d = 22.111;
        String str = "String :)";
        Test<Object> test = createAndAdd2Values((Object) d, (Object) str);
        test.printValues();
    }
}
