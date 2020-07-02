package ru.bubenova.completedTask.lesson9;

public class MaxValueSearch {
    public static void main(String[] args) {
        double[] array = {1, 2.0, 0, 32.5, 6.1, 2.0, -1.1, 1.2, 0.9, -32.6, 14.2};

        System.out.println("Максимальное значение в массиве - " + getMaxValue(array));
    }

    public static double getMaxValue(double[] inputArray) {
        double maxValue = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }

        return maxValue;
    }
}