package ru.bubenova.completedTask.lesson11;

public class QuickSort {
    public static void sortArrayInAscendingOrder(int[] array, int left, int right) {
        if (array.length == 0) {
            return;
        }

        if (left == right) {
            return;
        }

        if (right - left == 1) {
            if (array[left] > array[right]) {
                int temp = array[right];
                array[right] = array[left];
                array[left] = temp;
            }

            return;
        }

        int supportingElement = array[left];
        int i = left;
        int j = right;

        while (i <= j) {
            while (supportingElement > array[i]) {
                i++;
            }

            while (supportingElement < array[j]) {
                j--;
            }

            if (i <= j) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;

                i++;
                j--;
            }
        }

        if (i < right) {
            sortArrayInAscendingOrder(array, i, right);
        }

        if (j > left) {
            sortArrayInAscendingOrder(array, left, j);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 97, -3, 6, 0, -15, 1};

        int left = 0;
        int right = array.length - 1;

        System.out.println("Массив в отсортированном виде: ");

        sortArrayInAscendingOrder(array, left, right);

        for (int value : array) {
            System.out.printf("%4d", value);
        }
    }
}