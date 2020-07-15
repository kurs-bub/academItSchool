package ru.bubenova.completedTask.lesson3;

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день: ");
        int day = scanner.nextInt();

        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        int maxDaysInMonthCount;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                maxDaysInMonthCount = 30;
                break;
            case 2:
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    maxDaysInMonthCount = 29;
                } else {
                    maxDaysInMonthCount = 28;
                }
                break;
            default:
                maxDaysInMonthCount = 31;
                break;
        }

        boolean isCorrectDate = (day <= maxDaysInMonthCount && month <= 12);

        if (!isCorrectDate) {
            System.out.println("Вы ввели некорректную дату!");
            return;
        }

        if (day == maxDaysInMonthCount) {
            if (month == 12) {
                day = 1;
                month = 1;
                year++;
                System.out.println("Завтра будет: " + day + "." + month + "." + year);
                return;
            }

            day = 1;
            month++;
            System.out.println("Завтра будет: " + day + "." + month + "." + year);
            return;
        }

        day++;

        System.out.println("Завтра будет: " + day + "." + month + "." + year);
    }
}