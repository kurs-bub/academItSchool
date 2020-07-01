package ru.bubenova.completedTask.lesson4;

public class DoWhile {
    public static void main(String[] args) {
        int from = 2;
        int to = 11;
        int sum = 0;
        int count = 0;

        int i = from;

        do {
            sum += i;
            count++;
            ++i;
        } while (i <= to);

        double average = (double) sum / count;
        System.out.println("Среднее арифметическое равно: " + average);

        int j = from;
        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        do {
            if (j % 2 == 0) {
                evenNumbersSum += j;
                evenNumbersCount++;
            }

            ++j;
        } while (j <= to);

        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;
        System.out.println("Среднее арифметическое четных чисел равно: " + evenNumbersAverage);
    }
}