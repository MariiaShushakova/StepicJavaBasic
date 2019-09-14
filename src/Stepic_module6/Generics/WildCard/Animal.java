package Stepic_module6.Generics.WildCard;

public class Animal {
    private int id;

    public Animal(){

    }
    public Animal(int id){
        this.id = id;
    }
    public void eat(){
        System.out.println("Animal eating");
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
