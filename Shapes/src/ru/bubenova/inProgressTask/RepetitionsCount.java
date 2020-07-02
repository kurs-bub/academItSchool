package ru.bubenova.inProgressTask;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RepetitionsCount {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("XXX.txt"))) {
            String text = scanner.nextLine();
            String template = "забор";

            System.out.println("Ищем упоминание текста: " + template);
            System.out.println("Количество раз, когда встречается текст: " + getRepetitionsCount(text, template));
        }
    }

    private static int getRepetitionsCount(String text, String template) {
        text = text.toLowerCase();
        template = template.toLowerCase();

        int templatesInTextCount = 0;
        int index = 0;

        for (; ; ) {
            index = text.indexOf(template, index);

            if (index < 0) {
                break;
            }

            templatesInTextCount++;
            index += template.length();
        }

        return templatesInTextCount;
    }
}