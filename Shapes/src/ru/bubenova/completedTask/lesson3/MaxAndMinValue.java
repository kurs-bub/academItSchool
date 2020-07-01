package ru.bubenova.completedTask.lesson3;

import java.util.Scanner;

public class MaxAndMinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: x = ");
        int x = scanner.nextInt();

        System.out.print("Введите целое число: y = ");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.printf("%d - наибольшее значение, ", x);
            System.out.printf("%d - наименьшее значение%n", y);
        } else {
            System.out.printf("%d - наибольшее значение, ", y);
            System.out.printf("%n%d - наименьшее значение%n", x);
        }

        int max1;
        int min1;

        if (x > y) {
            max1 = x;
            min1 = y;
        } else {
            max1 = y;
            min1 = x;
        }

        System.out.print(max1 + " - наибольшее значение, ");
        System.out.printf(min1 + " - наименьшее значение%n");

        int max2 = (x > y) ? x : y;
        System.out.printf("%d - наибольшее значение, ", max2);

        int min2 = (x < y) ? x : y;
        System.out.printf("%d - наименьшее значение", min2);
    }
}