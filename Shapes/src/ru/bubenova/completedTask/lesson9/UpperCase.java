package ru.bubenova.completedTask.lesson9;

import java.util.Arrays;

public class UpperCase {
    public static void main(String[] args) {
        String[] text = {"text", "text1", "TeXt!", "123", "текст", "Текст!"};

        convertToUpperCase(text);

        System.out.println(Arrays.toString(text));
    }

    public static void convertToUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
    }
}