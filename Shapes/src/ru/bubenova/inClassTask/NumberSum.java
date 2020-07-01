package ru.bubenova.inClassTask;

public class NumberSum {
    public static void main(String[] args) {
        int i1 = 0;
        int sum1 = 0;
        while (i1 <= 9) {
            sum1 += i1;
            ++i1;
        }
        System.out.println(sum1);

        int i2 = 3;
        int sum2 = 0;
        while (i2 <= 21) {
            sum2 += i2;
            ++i2;
        }
        System.out.println(sum2);

        int k = 3;
        int sum3 = 0;
        while (k <= 21) {
            if (k % 2 == 0) {
                sum3 += k;
            }

            k++;
        }
        System.out.println(sum3);
    }
}
