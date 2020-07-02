package ru.bubenova.completedTask.lesson11;

public class SelectionSort {
    public static void sortArrayInAscendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minElementIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[minElementIndex] > array[j]) {
                    minElementIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minElementIndex];
            array[minElementIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, -3, 6, 0, -15, 1};
        int[] array2 = {1, 2, 3, 4, 5, 6};

        System.out.println("Массив в отсортированном виде: ");

        sortArrayInAscendingOrder(array1);

        for (int value : array1) {
            System.out.printf("%4d", value);
        }

        System.out.println();

        // массив array2 уже отсортирован
        System.out.println("Массив в отсортированном виде: ");

        sortArrayInAscendingOrder(array2);

        for (int value : array2) {
            System.out.printf("%4d", value);
        }
    }
}