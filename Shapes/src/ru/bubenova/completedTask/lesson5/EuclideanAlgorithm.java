package ru.bubenova.completedTask.lesson5;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int userNumber1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int userNumber2 = scanner.nextInt();

        if (userNumber1 == 0 && userNumber2 == 0) {
            System.out.println("Вы ввели неккоректные данные (на ноль делить нельзя)");
        } else if (userNumber2 == 0) {
            System.out.println("Наибольший общий делитель равен " + userNumber1);
        } else {
            for (; ; ) {
                if (userNumber1 % userNumber2 == 0) {
                    System.out.println("Наибольший общий делитель равен " + userNumber2);
                    return;
                }

                int temp = userNumber1;
                userNumber1 = userNumber2;
                userNumber2 = temp % userNumber2;
            }
        }
    }
}