package temp;

import java.util.Arrays;
import java.util.LinkedList;

public class Car {
    String model;

    public Car(String model) {
        this.model = model;
    }

    public static void main(String[] args) {
        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari");
        Car bugatti = new Car("Bugatti");
        Car lambo = new Car("Lamborghini");
        Car ford = new Car("Ford Mondeo");
        Car fiat = new Car("Fiat Ducato");
        //cars add
        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);

        //addFirst AddLast
        cars.addFirst(ford);
        cars.addLast(fiat);
        System.out.println(cars);
        //peekFirst(), peekLast(): возвращают первый/последний элемент списка. Возвращают null, если список пуст
        System.out.println(cars.peekFirst());
        System.out.println(cars.peekLast());
        //pollFirst(), pollLast(): возвращают первый/последний элемент списка и удаляют его из списка. Возвращают null, если список пуст
        System.out.println(cars.pollFirst());
        System.out.println(cars.pollLast());
        //toArray(): возвращает массив из элементов списка
        Car[] carsArray = cars.toArray(new Car[3]);
        System.out.println(Arrays.toString(carsArray));
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}

