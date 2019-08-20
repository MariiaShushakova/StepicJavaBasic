package Stepic_module4.StepicTasks.task3;

public class Main {
    public static void main(String[] args) {
        new Main().test();
    }
    void test() {
        RobotConnectManage rcm = new RobotConnectManage();
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "attempt");
            moveRobot(rcm, i, 3);
        }
    }


    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i=0; i<3; i++) { // 3 попытки при успешных подкл
            try (RobotConnection rc = robotConnectionManager.getConnection()) { //уст коннекшен
                rc.moveRobotTo(toX, toY); //отдаем команду
                i = 3; // дошли до сюда, значит cnonection - OK (hack)
            } catch (RobotConnectionException e) { //ignore если connection - OK и мы его двинули
                if (i==2) throw e; // connection fail 3 раза
            }
        }
    }
}
