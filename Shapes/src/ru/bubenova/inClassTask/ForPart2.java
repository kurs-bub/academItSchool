package ru.bubenova.inClassTask;

public class ForPart2 {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {

            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        int n = 4;
        for (int j = 1; j <= n; j++) {
            double a = Math.pow(j, 2);
            System.out.println((int) a);
        }

        for (int k = 0; k <= 100; k++) {

            if (k == 5) {
                continue;
            }

            if (k % 3 == 0) {
                continue;
            }

            if (k >= 60 && k <= 80) {
                continue;
            }

            System.out.println(k);
        }

        int m = 0;
        while (m <= 100) {

            if (m == 5) {
                m++;
                continue;
            }

            if (m % 3 == 0) {
                m++;
                continue;
            }

            if (m >= 60 && m <= 80) {
                m++;
                continue;
            }

            System.out.println(m);
            m++;
        }
    }
}
