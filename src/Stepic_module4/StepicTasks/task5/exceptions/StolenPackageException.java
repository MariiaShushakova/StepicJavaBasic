package Stepic_module4.StepicTasks.task5.exceptions;

public class StolenPackageException extends RuntimeException {
    public StolenPackageException() {
        super("Discovered the theft from the parcel!");
    }
}
