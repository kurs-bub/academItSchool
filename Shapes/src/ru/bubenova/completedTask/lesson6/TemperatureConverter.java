package ru.bubenova.completedTask.lesson6;

import java.util.Scanner;

public class TemperatureConverter {
    public static double convertToKelvinScale(double celsiusDegrees) {
        return celsiusDegrees + 273.15;
    }

    public static double convertToFahrenheitScale(double celsiusDegrees) {
        return celsiusDegrees * 1.8 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру в градусах Цельсия: ");
        double inputTemperatureInCelsiusScale = scanner.nextDouble();

        System.out.println("Температура в градусах Кельвина будет равна: " + convertToKelvinScale(inputTemperatureInCelsiusScale) + " K");
        System.out.println("Температура в градусах Фаренгейта будет равна: " + convertToFahrenheitScale(inputTemperatureInCelsiusScale) + " F");
    }
}