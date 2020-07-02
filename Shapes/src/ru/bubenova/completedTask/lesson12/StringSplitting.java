package ru.bubenova.completedTask.lesson12;

public class StringSplitting {
    public static void main(String[] args) {
        String numbersSeries = "1, 2, 3, 4, 5";

        String[] numbersSeriesArray = numbersSeries.split(", ");

        int sum = 0;

        for (String value : numbersSeriesArray) {
            sum += Integer.parseInt(value);
        }

        System.out.println("Сумма чисел равна: " + sum);
    }
}