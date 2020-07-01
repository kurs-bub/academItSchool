package ru.bubenova.completedTask.lesson4;

import java.util.Scanner;

public class TenNumbersInLineHighLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите последнее число: ");
        int lastNumber = scanner.nextInt();

        System.out.print("Введите число чисел в строке: ");
        int numbersInLineCount = scanner.nextInt();

        int i = firstNumber;
        int serialNumber = 1;

        while (i <= lastNumber) {
            System.out.printf("%d\t", i);

            if (serialNumber % numbersInLineCount == 0) {
                System.out.println();
            }

            ++i;
            ++serialNumber;
        }
    }
}