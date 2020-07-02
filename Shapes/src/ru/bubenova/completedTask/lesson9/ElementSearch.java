package ru.bubenova.completedTask.lesson9;

import java.util.Scanner;

public class ElementSearch {
    public static void main(String[] args) {
        int[] array = {1, 5, 15, 24, -3, 0, 1456, -35, 245, 4};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число, которое хотите найти в массиве: ");
        int inputNumber = scanner.nextInt();

        System.out.println("Индекс этого элемента в массиве: " + getElementFromArray(array, inputNumber));
    }

    public static int getElementFromArray(int[] inputArray, int foundNumber) {
        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i] == foundNumber) {
                return i;
            }
        }

        return -1;
    }
}