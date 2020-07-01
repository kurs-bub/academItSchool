package ru.bubenova.inClassTask;

import java.util.Scanner;

public class Requirment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Данное число - положительное");
        } else if (number == 0) {
            System.out.println("Данное число равно нулю");
        } else {
            System.out.println("Данное число - отрицательное");
        }
    }
}
