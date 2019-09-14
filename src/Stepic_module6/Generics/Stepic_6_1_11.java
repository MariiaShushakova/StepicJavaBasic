package Stepic_module6.Generics;

import java.util.Optional;

public class Stepic_6_1_11 {
    public static void main(String[] args) {

    }
    /*
     * What operations are allowed within a method?
     * ("Enable" = "The compiler compiles")
     */
    class Example<X> {
        public void someMethod(Object obj) {
            X other = (X)obj;
            Optional<X> opt = Optional.empty();
            //if (obj instanceof X) {}
            //if (obj instanceof Optional<X>) {}
            //X xxx = new X();
            //X[] xxx = new X();
        }
    }
}
