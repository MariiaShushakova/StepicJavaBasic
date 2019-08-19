package Stepic_module4.LernExeption;

public class Exam {
    String name;
    boolean isTestPassed;
    boolean isHWpassed;
    boolean isAttendanceOK;

    public Exam (String name){
        this.name = name;
    }

    public void passTest(){
        System.out.println("Test passed!");
        this.isTestPassed = true;
    }
    public void passHW(){
        System.out.println("HW passed!");
        this.isHWpassed = true;
    }
    public void attendance(){
        System.out.println("Attendance ok!");
        this.isAttendanceOK = true;
    }

    //Exception for method
    public void passExam() throws PassExamIsNotReadyException{
        System.out.println("Try to pass exam...");
        if(isTestPassed && isHWpassed && isAttendanceOK){
            System.out.println("Exam passed!");
        } else {
            throw new PassExamIsNotReadyException ("Exam " + name + " cann't be passed");
        }
    }
}
