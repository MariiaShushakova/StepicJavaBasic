package temp;

import java.util.Objects;

public class Temp {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        System.out.println(pair.getFirst()); // 1
        System.out.println(pair.getSecond()); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        System.out.println(pair.equals(pair2)); // must be true!
        System.out.println(pair.hashCode() == pair2.hashCode()); // must be true!
    }


}
