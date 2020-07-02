package ru.bubenova.completedTask.lesson9;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 7, -3, 4, -35, 245, 6};

        System.out.println("Среднее арифметическое четных чисел равно: " + getArrayAverage(array));
    }

    public static double getArrayAverage(int[] inputArray) {
        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        for (int e : inputArray) {
            if (e % 2 == 0) {
                evenNumbersSum += e;
                evenNumbersCount++;
            }
        }

        return (double) evenNumbersSum / evenNumbersCount;
    }
}