package ru.job4j.poly;

import java.util.Scanner;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Начало движения");
    }

    @Override
    public void passengers(int quantity) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество пассажиров");
        quantity = Integer.parseInt(input.nextLine());
        System.out.println("В машине будет " + quantity + " пассажира.");
    }

    @Override
    public double fill(double volume) {
        double price = 55;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите объем топлива для заправки");
        volume = Double.parseDouble(input.nextLine());
        double sum = volume * price;
        System.out.println("Сумма к оплате " + sum + " р.");
        return sum;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.drive();
        bus.passengers(3);
        bus.fill(4);
    }
}
