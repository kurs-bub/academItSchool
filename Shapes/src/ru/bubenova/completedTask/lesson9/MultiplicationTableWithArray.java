package ru.bubenova.completedTask.lesson9;

import java.util.Scanner;

public class MultiplicationTableWithArray {
    public static int[][] getMultiplicationTable(int tableVerticalSize, int tableHorizontalSize) {
        int[][] multiplicationTable = new int[tableVerticalSize][tableHorizontalSize];

        for (int i = 1; i <= tableVerticalSize; i++) {
            for (int j = 1; j <= tableHorizontalSize; j++) {
                multiplicationTable[i - 1][j - 1] = i * j;
            }
        }

        return multiplicationTable;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер таблицы умножения (количество строк): ");
        int tableVerticalSize = scanner.nextInt();

        System.out.println("Введите размер таблицы умножения (количество столбцов): ");
        int tableHorizontalSize = scanner.nextInt();

        System.out.print("    |");

        int from = 1;

        for (int i = from; i <= tableHorizontalSize; i++) {
            System.out.printf("%4d", i);
        }

        System.out.println();
        System.out.print("----|");

        for (int i = from; i <= tableHorizontalSize; i++) {
            System.out.print("----");
        }

        System.out.println();

        int[][] multiplicationTable = getMultiplicationTable(tableVerticalSize, tableHorizontalSize);

        for (int i = 1; i <= multiplicationTable.length; i++) {
            System.out.printf("%4d|", i);

            for (int j = 1; j <= multiplicationTable[i - 1].length; j++) {
                System.out.printf("%4d", multiplicationTable[i - 1][j - 1]);
            }

            System.out.println();
        }
    }
}