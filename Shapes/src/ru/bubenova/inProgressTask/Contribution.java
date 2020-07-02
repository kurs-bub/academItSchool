package ru.bubenova.inProgressTask;

import java.util.Scanner;

public class Contribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада: ");
        double userStartSum = scanner.nextDouble();

        System.out.println("Введите процентную ставку: ");
        double percent = scanner.nextDouble();

        System.out.println("Введите период вклада (количество месяцев): ");
        int userMonthsCount = scanner.nextInt();

        double profit = 0;
        final int monthsInYearCount = 12;
        final int divisorOfOneHundred = 100;
        double contributionCoefficient = percent / divisorOfOneHundred / monthsInYearCount;

        for (int i = 0; i < userMonthsCount; i++) {
            profit += (userStartSum + profit) * contributionCoefficient;
        }

        double userFinalSum = profit + userStartSum;

        System.out.printf("Сумма вклада по истечению срока составит: %.2f у.е.", userFinalSum);
        System.out.println();
        System.out.printf("Прибыль составит: %.2f у.е.", profit);
    }
}