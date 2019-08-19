package Stepic_module4.LernExeption;

public class ExeptionLesson {
    public static void main(String[] args) {
        Exam exam = new Exam ("Math");
        //exam.attendance();
        exam.passHW();
        exam.passTest();
        try {                                  // исключения надо обработать
            exam.passExam();
        } catch (PassExamIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Check: Attendance ok? " + exam.isAttendanceOK + " HW pass? " + exam.isHWpassed + " Tests pass " + exam.isTestPassed);
        }
    }
}
