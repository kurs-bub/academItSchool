package ru.bubenova.completedTask.lesson9;

import java.util.Arrays;

public class SortingCheck {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 5, 6, 9, 10}; // по возрастанию

        System.out.println(Arrays.toString(array1) + " - Сортировка по возрастанию? " + isAscendingSort(array1));
        System.out.println(Arrays.toString(array1) + " - Сортировка по убыванию? " + isDescendingSort(array1));

        int[] array2 = {7, 4, 2, -1}; // по убыванию

        System.out.println(Arrays.toString(array2) + " - Сортировка по возрастанию? " + isAscendingSort(array2));
        System.out.println(Arrays.toString(array2) + " - Сортировка по убыванию? " + isDescendingSort(array2));

        int[] array3 = {-5, 7, 0, 6, 1}; // без сортировки

        System.out.println(Arrays.toString(array3) + " - Сортировка по возрастанию? " + isAscendingSort(array3));
        System.out.println(Arrays.toString(array3) + " - Сортировка по убыванию? " + isDescendingSort(array3));
    }

    public static boolean isDescendingSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAscendingSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }
}