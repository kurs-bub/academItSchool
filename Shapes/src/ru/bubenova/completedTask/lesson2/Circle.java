package ru.bubenova.completedTask.lesson2;

public class Circle {
    public static void main(String[] args) {
        double circleRadius = 3;
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        double circleLength = 2 * Math.PI * circleRadius;
        System.out.println("Площадь круга = " + circleArea);
        System.out.println("Длина окружности = " + circleLength);

        double circleArea2 = 52;
        double circleRadius2 = Math.sqrt(circleArea2 / Math.PI);
        System.out.println("Радиус круга = " + circleRadius2);

        double circleAngle = 14;
        double circleRadius3 = 6;
        double sectorArea = Math.PI * Math.pow(circleRadius3, 2) * circleAngle / 360;
        System.out.println("Площадь сектора = " + sectorArea);
    }
}
