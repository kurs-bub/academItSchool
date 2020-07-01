package ru.bubenova.completedTask.lesson2;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Здравствуй, " + name + "!");
    }
}