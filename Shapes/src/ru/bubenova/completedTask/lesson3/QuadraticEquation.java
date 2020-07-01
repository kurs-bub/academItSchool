package ru.bubenova.completedTask.lesson3;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a: ");
        double a = scanner.nextDouble();

        System.out.println("Введите число b: ");
        double b = scanner.nextDouble();

        System.out.println("Введите число c: ");
        double c = scanner.nextDouble();

        final double epsilon = 1.0e-10;

        if (Math.abs(a) <= epsilon) {
            if (Math.abs(b) > epsilon) {
                double x = -c / b;
                System.out.println("x = " + x);
            } else {
                if (Math.abs(c) <= epsilon) {
                    System.out.println("х - любое значение");
                } else {
                    System.out.println("Нет решения");
                }
            }
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant > -epsilon) {
                System.out.println("Уравнение не имеет корней");
            } else if (Math.abs(discriminant) <= epsilon) {
                double x = -b / (2 * a);
                System.out.println("x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("х1 = " + x1);
                System.out.println("х2 = " + x2);
            }
        }
    }
}