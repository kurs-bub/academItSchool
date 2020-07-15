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

        final int monthsInYearCount = 12;
        final int oneHundredPercent = 100;

        double contributionSum = userStartSum;
        double contributionCoefficient = percent / oneHundredPercent;

        for (int i = 0; i < userMonthsCount; i++) {
            double profit = userStartSum * contributionCoefficient / monthsInYearCount;
            contributionSum += profit;
        }

        double totalProfit = contributionSum - userStartSum;

        System.out.format("Сумма вклада по истечению срока составит: %.3f у.е."
                + System.lineSeparator() + "Прибыль составит: %.3f у.е.", contributionSum, totalProfit);
    }
}