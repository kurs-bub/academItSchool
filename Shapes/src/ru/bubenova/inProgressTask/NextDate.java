package ru.bubenova.inProgressTask;

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

        int maxDaysInMonth;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                maxDaysInMonth = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    maxDaysInMonth = 29;
                else
                    maxDaysInMonth = 28;
                break;
            default:
                maxDaysInMonth = 31;
                break;
        }

        boolean isCorrectData = (day <= maxDaysInMonth && month <= 12);

        if (isCorrectData) {
            if (day == maxDaysInMonth) {
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
        } else {
            System.out.println("Вы ввели некорректную дату!");
            return;
        }

        System.out.println("Завтра будет: " + day + "." + month + "." + year);
    }
}