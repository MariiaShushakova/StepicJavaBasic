package Stepic_module4.StepicTasks.task3;

public class Main {
    public static void main(String[] args) {
        new Main().test();
    }

    void test() {
        RobotConnectManage rcm = new RobotConnectManage();
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "attempt");
            moveRobot2(rcm, i, 3);
        }
    }

    /* 1)Попытка отдать команду роботу считается успешной, если удалось установить соединение и выполнить метод RobotConnection.moveRobotTo() без исключений. Ошибка закрытия соединения не важна и должна игнорироваться.
2) Если первая попытка подключиться и отдать команду оказалась неуспешной, то закрываем соединение и выполняем вторую попытку. Если вторая тоже не удалась, то выполняется третья. После третьей неудачи метод должен бросить исключение RobotConnectionException.
3) Метод отвечает за открытие и закрытие соединения. Если соединение удалось установить, то оно обязательно должно быть закрыто несмотря на возможные исключения, случившиеся в дальнейшем во время работы метода.
4) Если во время работы метода случилось исключение любого типа, отличного от RobotConnectionException, метод должен завершиться и выбросить это исключение, не выполняя повторных попыток пообщаться с роботом. Единственное, что метод должен сделать перед выбросом этого исключения — закрыть открытое соединение RobotConnection.*/

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

    public static void moveRobot2(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection rc = null;
        for (int i = 0; i < 3; i++) {
            try {
                rc = robotConnectionManager.getConnection();
                rc.moveRobotTo(toX, toY);
                break;
            } catch (RobotConnectionException e) {
                if (i == 2) throw e;
            } finally {
                if (rc != null)
                    try {
                        rc.close();
                    } catch (Throwable e) {
                    }
            }
        }
    }
}
