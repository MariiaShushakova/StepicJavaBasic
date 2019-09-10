package temp;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;
/*Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару элементов разных типов и не запрещающий элементам принимать значение null.
Реализуйте методы getFirst(), getSecond(), equals() и hashCode(), а также статический фабричный метод of(). Конструктор должен быть закрытым (private).*/

class Pair<T1, T2> {
    private T1 first; // пару элементов разных типов
    private T2 second;

    private Pair(T1 first, T2 second) { //конструктор
        this.first = first;
        this.second = second;
    }

//    public static <T> Optional<T> of(T value) {
//        return new Optional<>(value); }
    public static <T1, T2> Pair<T1, T2> of(T1 first, T2 second) { //статический фабричный метод of()
        return new Pair<>(first, second);
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) //Obj равен самому себе
            return true;

        if (obj == null) //Obj сравниваем на null
            return true;

        if (!(obj instanceof Pair)) //принадлежность класса
            return false;

        Pair<T1, T2> other = (Pair<T1, T2>) obj; //явное приведение объекта
        return Objects.equals(first, other.first) && //Сравнение по полям
                Objects.equals(second, other.second);
    }

    @Override //копи паст из Optional
    public int hashCode() {
        return Objects.hashCode(this.first) + Objects.hashCode(this.second);
    }
}

