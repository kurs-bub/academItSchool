package ru.bubenova.completedTask.lesson3;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Пользователь вводит значения вершин треугольника
        System.out.print("Введите координаты точки А: x = ");
        double x1 = scanner.nextDouble();

        System.out.print("Введите координаты точки А: y = ");
        double y1 = scanner.nextDouble();

        System.out.print("Введите координаты точки B: x = ");
        double x2 = scanner.nextDouble();

        System.out.print("Введите координаты точки B: y = ");
        double y2 = scanner.nextDouble();

        System.out.print("Введите координаты точки C: x = ");
        double x3 = scanner.nextDouble();

        System.out.print("Введите координаты точки C: y = ");
        double y3 = scanner.nextDouble();

        // проверим, лежат ли точки на одной прямой
        double epsilon = 1.0e-10;

        if (Math.abs((x2 - x3) * (y1 - y3) - (x1 - x3) * (y2 - y3)) <= epsilon) {
            System.out.println("Точки, координаты которых вы ввели, лежат на одной прямой.");
        } else {
            // найдем длины сторон треугольника
            double lengthAB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double lengthBC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            double lengthAC = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

            // находим полупериметр
            double halfPerimeter = (lengthAB + lengthBC + lengthAC) / 2;

            // находим площадь
            double triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - lengthAB) * (halfPerimeter - lengthBC) * (halfPerimeter - lengthAC));
            System.out.println("Площадь треугольника с координатами таких вершин равна: " + triangleArea);
        }
    }
}