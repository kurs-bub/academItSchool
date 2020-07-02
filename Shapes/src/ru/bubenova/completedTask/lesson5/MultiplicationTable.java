package ru.bubenova.completedTask.lesson5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void printMultiplicationTable(int from, int to) {
        // делаем "шапку"
        System.out.print("    |");

        for (int i = from; i <= to; i++) {
            System.out.printf("%4d", i);
        }

        System.out.println();
        System.out.print("----|");

        for (int i = from; i <= to; i++) {
            System.out.print("----");
        }

        System.out.println();

        // вычисляем значения для таблицы
        for (int i = from; i <= to; i++) {
            System.out.printf("%4d|", i);

            for (int j = from; j <= to; j++) {
                System.out.printf("%4d", (i * j));
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Чтобы распечатать таблицу по умолчанию (10x10), нажмите 1;");
        System.out.println("Чтобы распечатать таблицу с заданным размером, нажмите 2.");
        System.out.println("Введите команду: ");
        int command = scanner.nextInt();

        int from = 1;
        switch (command) {
            case 1:
                int defaultTo = 10;
                printMultiplicationTable(from, defaultTo);
                break;
            case 2:
                System.out.println("Введите размер таблицы: ");
                int userTo = scanner.nextInt();

                printMultiplicationTable(from, userTo);
                break;
            default:
                System.out.println("Вы ввели неизвестную команду :(");
        }
    }
}
