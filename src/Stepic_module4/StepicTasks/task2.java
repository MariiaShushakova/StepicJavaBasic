package Stepic_module4.StepicTasks;

public class task2 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        Exception ex = new Exception();
        StackTraceElement[] el =  ex.getStackTrace();// массив из StackTrace elements
        if (el.length > 2) {
            return el[2].getClassName() + "#" + el[2].getMethodName();
            //el[0] -вызван сам getStackTrace, el[1] - имя метода (свое имя), el[2] - имя метода кто вызвал [1]
        } else {return null;}
    }
}
