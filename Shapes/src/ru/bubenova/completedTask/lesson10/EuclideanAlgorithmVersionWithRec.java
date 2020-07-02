package ru.bubenova.completedTask.lesson10;

import java.util.Scanner;

public class EuclideanAlgorithmVersionWithRec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int userNumber1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int userNumber2 = scanner.nextInt();

        int greatestCommonDivisor = getGreatestCommonDivisor(userNumber1, userNumber2);

        if (greatestCommonDivisor == -1) {
            System.out.println("Вы ввели неккоректные данные");
        } else {
            System.out.println("Наибольший общий делитель равен " + greatestCommonDivisor);
        }
    }

    public static int getGreatestCommonDivisor(int number1, int number2) {
        if (number1 == 0 && number2 == 0) {
            return -1;
        }

        if (number1 == 0) {
            return number2;
        }

        if (number2 == 0) {
            return number1;
        }

        if (number1 % number2 == 0) {
            return number2;
        }

        return getGreatestCommonDivisor(number2, number1 % number2);
    }
}