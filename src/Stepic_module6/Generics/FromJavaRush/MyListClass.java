package Stepic_module6.Generics.FromJavaRush;

//Облегченный ArrayList
public class MyListClass {
    private Object[] data;
    private int count;

    public MyListClass(){
        this.data = new Object[10];
        this.count = 0;
    }
    public void add(Object o){
        this.data[count]=o;
        count++;
    }
    public Object[] getData(){
        return data;
    }
}
