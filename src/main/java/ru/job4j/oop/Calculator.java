package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public double divide(int y) {
        return y / x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public double sumAllOperation(int y) {
        return multiply(y) + divide(y) + minus(y) + sum(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("sum = " + Calculator.sum(10));
        System.out.println("multiply = " + calculator.multiply(10));
        System.out.println("minus = " + Calculator.minus(10));
        System.out.println("divide = " + calculator.divide(10));
        System.out.println("sumAllOperation = " + calculator.sumAllOperation(10));
    }
}
