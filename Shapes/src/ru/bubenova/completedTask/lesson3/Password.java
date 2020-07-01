package ru.bubenova.completedTask.lesson3;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "Qwerty123";

        System.out.println("Введите пароль: ");
        String inputPassword = scanner.nextLine();

        if (password.equals(inputPassword)) {
            System.out.println("Пароль верный");
        } else if (inputPassword.length() > password.length()) {
            System.out.println("Пароль неверный. Введенный пароль слишком длинный");
        } else if (inputPassword.length() < password.length()) {
            System.out.println("Пароль неверный. Введенный пароль слишком короткий");
        } else {
            System.out.println("Пароль неверный:(");
        }
    }
}
