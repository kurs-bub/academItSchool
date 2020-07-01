package ru.bubenova.inClassTask;

public class CalculationAtLesson {
    public static double getFunction(double x, double y) {
        return 3 * x + 4 * y;
    }

    public static int getMax(int x, int y) {
        int max;

        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    }

    public static int getMin(int x, int y) {
        int min = (x < y) ? x : y;

        return min;
    }

    public static void main(String[] args) {
        double result1 = getFunction(1,2);
        System.out.println(result1);

        double result2 = getFunction(1.3,1.1);
        System.out.println(result2);

        int minResult = getMin(1, 2);
        System.out.println(minResult);

        int maxResult = getMax(1, 4);
        System.out.println(maxResult);
    }
}