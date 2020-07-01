package ru.bubenova.completedTask.lesson4;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел ряда: ");
        int seriesNumbersCount = scanner.nextInt();

        int i = 1;
        int seriesSum = 0;

        System.out.print("Получился ряд: ");

        while (i <= seriesNumbersCount) {
            int squaredNumber = (int) Math.pow(i, 2);

            if (i % 2 != 0) {
                seriesSum += squaredNumber;
                System.out.print(" + " + squaredNumber);
            } else {
                seriesSum -= squaredNumber;
                System.out.print(" - " + squaredNumber);
            }

            ++i;
        }

        System.out.print(System.lineSeparator() + "Сумма ряда равна: " + seriesSum);
    }
}