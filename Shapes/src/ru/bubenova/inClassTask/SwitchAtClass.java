package ru.bubenova.inClassTask;

import java.util.Scanner;

public class SwitchAtClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду: ");
        String command = scanner.nextLine();

        switch (command) {
            case "print":
                System.out.println("Введите строку: ");
                String name = scanner.nextLine();

                System.out.println(name);
                break;
            case "sum":
                System.out.println("Введите число а: ");
                double a = scanner.nextInt();

                System.out.println("Введите число b: ");
                double b = scanner.nextInt();

                System.out.println(a + b);
                break;
            default:
                System.out.println("Вы ввели неизвестную команду :(");
        }
    }
}
