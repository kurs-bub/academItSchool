package ru.bubenova.completedTask.lesson4;

public class Average {
    public static void main(String[] args) {
        int from = 2;
        int to = 11;
        int sum = 0;
        int count = 0;

        int i = from;

        while (i <= to) {
            sum += i;
            count++;
            ++i;
        }

        double average = (double) sum / count;
        System.out.println("Среднее арифметическое равно: " + average);

        from = 2;
        to = 11;
        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        int j = from;

        while (j <= to) {
            if (j % 2 == 0) {
                evenNumbersSum += j;
                evenNumbersCount++;
            }

            ++j;
        }

        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;
        System.out.println("Среднее арифметическое четных чисел равно: " + evenNumbersAverage);
    }
}