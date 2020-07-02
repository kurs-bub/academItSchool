package ru.bubenova.completedTask.lesson8;

import java.util.Scanner;

public class MaxSubstringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любой текст: ");
        String userText = scanner.nextLine();

        System.out.println("Максимальная длина одинаковых символов, идущих подряд, равна - " + getMaxSubstringLength(userText));
    }

    public static int getMaxSubstringLength(String text) {
        text = text.toLowerCase();

        int tempLength = 0;

        if (text.length() > 0) {
            tempLength = 1;
        }

        int maxLength = tempLength;

        for (int i = tempLength; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(i - 1)) {
                tempLength++;
            } else {
                tempLength = 1;
            }

            if (tempLength > maxLength) {
                maxLength = tempLength;
            }
        }

        return maxLength;
    }
}