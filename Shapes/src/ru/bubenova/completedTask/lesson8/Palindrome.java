package ru.bubenova.completedTask.lesson8;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любой текст: ");
        String userText = scanner.nextLine();

        System.out.println(isPalindrome(userText) ? "Это палиндром" : "Это не палиндром");
    }

    public static boolean isPalindrome(String inputText) {
        inputText = inputText.toLowerCase();
        int i = 0;
        int j = inputText.length() - 1;

        while (i <= j) {
            if (!Character.isLetter(inputText.charAt(i))) {
                ++i;
                continue;
            }

            if (!Character.isLetter(inputText.charAt(j))) {
                --j;
                continue;
            }

            if (inputText.charAt(i) != inputText.charAt(j)) {
                return false;
            }

            ++i;
            --j;
        }

        return true;
    }
}