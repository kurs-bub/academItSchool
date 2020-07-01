package ru.bubenova.completedTask.lesson2;

public class ExpressionsEvaluation {
    public static void main(String[] args) {
        double x = 3 - ((56 - 12) / 44) * (4 / 2);
        System.out.println("x = " + x);

        double y = 2 * x / (33 - x);
        System.out.println("y = " + y);

        double z = -x / (2 * y);
        System.out.println("z = " + z);
    }
}