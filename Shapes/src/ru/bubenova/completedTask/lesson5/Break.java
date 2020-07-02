package ru.bubenova.completedTask.lesson5;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String puzzledString = "Hello, dear friend!";

        System.out.println("Попробуйте угадать фразу, введя ее в консоль: ");
        String inputString = scanner.nextLine();

        for (; ; ) {
            if (inputString.equals(puzzledString)) {
                System.out.println("Поздравляю, вы угадали!");
                break;
            }

            System.out.println("Вы не угадали, попробуйте еще раз: ");
            inputString = scanner.nextLine();
        }
    }
}