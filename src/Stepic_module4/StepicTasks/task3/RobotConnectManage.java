package Stepic_module4.StepicTasks.task3;

public class RobotConnectManage implements RobotConnectionManager {

    @Override
    public RobotConnect getConnection() {
        System.out.println("No connection"); // for debug
        throw new RobotConnectionException("Exc doesn't connect");
    }
}
