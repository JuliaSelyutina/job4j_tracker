package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        String result;
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        input.nextLine();

        int answer = new Random().nextInt(3);
        result = switch (answer) {
            case 0 -> "да";
            case 1 -> "нет";
            default -> "может быть";
        };
        System.out.println("Ответ - " + result);
    }
}
