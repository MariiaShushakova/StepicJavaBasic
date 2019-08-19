package Stepic_module4.LernExeption;

public class PassExamIsNotReadyException extends Exception { //название класса должно оканчиваться на ..Exception

    public PassExamIsNotReadyException(String message){ //конструктор с сообщением от системы с описанием возникшей ошибки.
        super(message);
    }
}
