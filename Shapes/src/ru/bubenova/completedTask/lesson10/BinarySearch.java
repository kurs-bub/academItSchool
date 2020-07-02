package ru.bubenova.completedTask.lesson10;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 10, 12, 6};
        int number1 = 7; // число есть в массиве
        int number2 = 4; // числа нет в массиве

        int left = 0;
        int right = array.length - 1;

        System.out.println("Поиск через рекурсию: ");
        System.out.println(number1 + " находится на " + binarySearch(array, left, right, number1) + " позиции");
        System.out.println(number2 + " находится на " + binarySearch(array, left, right, number2) + " позиции");

        System.out.println("Поиск через цикл: ");
        System.out.println(number1 + " находится на " + binarySearchCycle(number1, array) + " позиции");
        System.out.println(number2 + " находится на " + binarySearchCycle(number2, array) + " позиции");
    }

    public static int binarySearch(int[] array, int left, int right, int pattern) {
        if (left > right) {
            return -1;
        }

        int middle = (right + left) / 2;

        if (array[middle] < pattern) {
            return binarySearch(array, middle + 1, right, pattern);
        }

        if (array[middle] > pattern) {
            return binarySearch(array, left, middle - 1, pattern);
        }

        return middle;
    }

    public static int binarySearchCycle(int pattern, int[] array) {
        int left = 0;
        int right = array.length - 1;
        int middle;

        do {
            if (left > right) {
                return -1;
            }

            middle = (right + left) / 2;

            if (array[middle] < pattern) {
                left = middle + 1;
            } else if (array[middle] > pattern) {
                right = middle - 1;
            }
        } while (array[middle] != pattern);

        return middle;
    }
}