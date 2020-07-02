package ru.bubenova.completedTask.lesson10;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.print("Введите степень числа: ");
        int exponent = scanner.nextInt();

        System.out.println("Результат возведения в степень рекурсией: " + raiseNumberToPower(number, exponent));
        System.out.println("Результат возведения в степень циклом: " + raiseNumberToPowerCycle(number, exponent));
    }

    public static int raiseNumberToPower(int number, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        return raiseNumberToPower(number, exponent - 1) * number;
    }

    public static int raiseNumberToPowerCycle(int number, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        int result = number;

        for (int i = 1; i < exponent; i++) {
            result *= number;
        }

        return result;
    }
}