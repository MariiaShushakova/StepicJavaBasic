package Stepic_module6.Generics.task1;

public class Pair {
    private String second;
    private String first;

    private Pair (String second, String first){
        this.first = first;
        this.second = second;
    }

    public String getFirst(){
        return first;
    }
    public String getSecond(){
        return second;

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void of(){

    }
}
