package ru.bubenova.completedTask.lesson5;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите натуральное число: ");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("1 - не является простым числом");
        } else {
            System.out.println("Ряд простых чисел, не превышающих введенное число:");

            for (int i = 2; i <= number; i++) {
                boolean isPrimeNumber = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrimeNumber = false;
                        break;
                    }
                }

                if (isPrimeNumber) {
                    System.out.println(i);
                }
            }
        }
    }
}