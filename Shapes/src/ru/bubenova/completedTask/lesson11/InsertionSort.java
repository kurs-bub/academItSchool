package ru.bubenova.completedTask.lesson11;

public class InsertionSort {
    public static void sortArrayInAscendingOrder(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];

            for (int j = i - 1; j >= -1; j--) {
                if (j < 0 || temp >= array[j]) {
                    array[j + 1] = temp;
                    break;
                }

                array[j + 1] = array[j];
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 97, -3, 6, 0, -15, 1};
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