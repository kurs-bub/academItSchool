package ru.bubenova.completedTask.lesson4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a: ");
        int numberA = scanner.nextInt();

        System.out.println("Введите число b: ");
        int numberB = scanner.nextInt();

        System.out.println("Введите команду: ");
        int commandCode = scanner.nextInt();

        switch (commandCode) {
            case 1:
                System.out.println("Сумма чисел равна: " + (numberA + numberB));
                break;
            case 2:
                System.out.println("Разность чисел равна: " + (numberA - numberB));
                break;
            case 3:
                System.out.println("Произведение чисел равно: " + (numberA * numberB));
                break;
            case 4:
                System.out.println("Результат от деления чисел a на b равен: " + ((double) numberA / numberB));
                break;
            default:
                System.out.println("Вы ввели неизвестную команду");
        }
    }
}