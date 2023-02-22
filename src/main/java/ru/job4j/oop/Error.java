package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Error is active = " + active);
        System.out.println("Error status = " + status);
        System.out.println("Error message = " + message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error emptyError = new Error();
        Error forbiddenError = new Error(true, 403, "Forbidden");
        Error gatewayTimeoutError = new Error(false, 504, "Gateway Timeout");
        emptyError.printInfo();
        forbiddenError.printInfo();
        gatewayTimeoutError.printInfo();
    }
}
