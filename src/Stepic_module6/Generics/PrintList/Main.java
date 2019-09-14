package Stepic_module6.Generics.PrintList;

public class Main {
    public static void main(String[] args) {
        PrintList<String> plS = new PrintList<>();

        for (int i = 0; i < 10; i++){
            plS.add("" + i);
        }
        plS.printList(true);

        PrintList<Integer> plI = new PrintList<Integer>();
        for (int i = 0; i < 10; i++){
            plI.add(i);
        }
        plI.printList(false);
    }
}
