package ru.bubenova.completedTask.lesson4;

public class TenNumbersInLine {
    public static void main(String[] args) {
        int from = 1;
        int to = 100;
        int i = from;

        while (i <= to) {
            System.out.printf("%d\t", i);

            if (i % 10 == 0) {
                System.out.println();
            }

            ++i;
        }
    }
}