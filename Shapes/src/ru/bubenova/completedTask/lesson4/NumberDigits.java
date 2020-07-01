package ru.bubenova.completedTask.lesson4;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int allDigitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = 0;

        while (number >= 1) {
            int lastDigit = number % 10;

            if (lastDigit % 2 != 0) {
                oddDigitsSum += lastDigit;
            }

            if (lastDigit > maxDigit) {
                maxDigit = lastDigit;
            }

            allDigitsSum += lastDigit;
            number /= 10;
        }

        System.out.println("Сумма цифр этого числа равна: " + allDigitsSum);
        System.out.println("Сумма нечетных цифр этого числа равна: " + oddDigitsSum);
        System.out.println("Максимальная цифра этого числа равна: " + maxDigit);
    }
}