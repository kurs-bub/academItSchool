package ru.bubenova.completedTask.lesson3;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();

        if (age < 1) {
            System.out.println("Вы слишком малы");
        } else if (age > 112) {
            System.out.println("Вы слишком стары");
        } else {
            int ageLastDigit = age % 10;
            int ageLastTwoDigits = age % 100;

            if ((ageLastTwoDigits >= 11 && ageLastTwoDigits <= 19) || ageLastDigit >= 5 || ageLastDigit == 0) {
                System.out.println("Вам " + age + " лет");
            } else if (ageLastDigit == 1) {
                System.out.println("Вам " + age + " год");
            } else {
                System.out.println("Вам " + age + " года");
            }
        }
    }
}