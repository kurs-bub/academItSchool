package ru.bubenova.completedTask.lesson3;

import java.util.Scanner;

public class IntercalaryYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год: ");
        int userYear = scanner.nextInt();

        if ((userYear % 4 != 0) || (userYear % 100 == 0 && userYear % 400 != 0)) {
            System.out.printf("%d - невисокосный год", userYear);
        } else {
            System.out.printf("%d - високосный год", userYear);
        }
    }
}