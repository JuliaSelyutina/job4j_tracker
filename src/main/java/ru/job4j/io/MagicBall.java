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
        switch (answer) {
            case 0:
                result = "да";
                break;
            case 1:
                result = "нет";
                break;
            default:
                result = "может быть";
                break;
        }
        System.out.println("Ответ - " + result);
    }
}
