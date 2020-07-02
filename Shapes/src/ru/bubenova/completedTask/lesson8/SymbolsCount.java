package ru.bubenova.completedTask.lesson8;

import java.util.Scanner;

public class SymbolsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любой текст: ");
        String userText = scanner.nextLine();

        int lettersCount = 0;
        int digitsCount = 0;
        int whitespacesCount = 0;
        int otherSymbolsCount = 0;

        for (int i = 0; i < userText.length(); i++) {
            if (Character.isLetter(userText.charAt(i))) {
                lettersCount++;
            } else if (Character.isDigit(userText.charAt(i))) {
                digitsCount++;
            } else if (Character.isWhitespace(userText.charAt(i))) {
                whitespacesCount++;
            } else {
                otherSymbolsCount++;
            }
        }

        System.out.println("Количество букв в этом тексте: " + lettersCount);
        System.out.println("Количество чисел: " + digitsCount);
        System.out.println("Количество пробелов: " + whitespacesCount);
        System.out.println("Количество других символов: " + otherSymbolsCount);
    }
}