package Stepic_module3.Equals_HashCode;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1,111);
        Animal animal2 = new Animal(1,111);
        System.out.println(animal1.equals(animal2));
    }
}
class Animal{
    private int id;
    private  int dNK;
    public Animal (int id, int dNK){
         this.id = id;
         this.dNK = dNK;
    }

    @Override
    public boolean equals (Object anObj) {
        /** проверяем равенство сравниваемых объектов по ссылкам*/
        if (this == anObj) {
            return true;
        }
        /** объектный оператор ссылки и возвращает истину, если объект слева
         *  -экземпляр класса, указанного справа */
        if (anObj instanceof Animal) {
            Animal anObj1 = (Animal) anObj;
            /**  сравниваем animals по полям - id & dNK*/
            if ((this.id == anObj1.id) && (this.dNK == anObj1.dNK)) {
                return true;
            }
        }
        return false;
    }

//    @Override
//    public boolean equals (Object obj){
//        Animal otherAnimal = (Animal)obj; //приводим объект к Animal
//        return this.id == ((Animal) obj).id;
//    }
}