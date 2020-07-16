package ru.bubenova.completedTask.lesson7;

import ru.bubenova.completedTask.lesson7.Range;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double number2 = scanner.nextDouble();

        Range range = new Range(number1, number2);

        System.out.printf("Получили числовой промежуток от %f до %f", range.getFrom(), range.getTo());
        System.out.println();
        System.out.println("Длина этого числового дипозона равна " + range.getLength());

        System.out.println("Введите еще одно число, посмотрим, принадлежит ли оно числовому промежутку: ");
        double number3 = scanner.nextDouble();

        if (range.isInside(number3)) {
            System.out.println("Число " + number3 + " принадлежит числовому диапозону");
        } else {
            System.out.println("Число " + number3 + " НЕ принадлежит числовому диапозону");
        }

        range.setFrom(38);
        range.setTo(32.6);

        System.out.println("Промежуток от " + range.getFrom() + " до числа " + range.getTo());
        System.out.println("Длина промежутка равна " + range.getLength());
    }
}