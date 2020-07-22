package ru.bubenova.inProgressTask;

public class PyramidSort {
    public static void main(String[] args) {
        int[] array = {-3, 0, 345, -10, 1, 8, 2, 0, 632, 56, -283};

        sortArrayInAscendingOrder(array);

        System.out.println("Массив в отсортированном виде: ");

        for (int value : array) {
            System.out.printf("%4d", value);
        }
    }

    public static void sortArrayInAscendingOrder(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            siftElements(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 1; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            siftElements(array, i, 0);
        }
    }

    public static void siftElements(int[] array, int arrayLength, int parentIndex) {
        int maxIndex = parentIndex;

        while (true) {
            int leftChildIndex = 2 * parentIndex + 1;

            if ((leftChildIndex < arrayLength) && (array[leftChildIndex] > array[maxIndex])) {
                maxIndex = leftChildIndex;
            }

            int rightChildIndex = 2 * parentIndex + 2;

            if ((rightChildIndex < arrayLength) && (array[rightChildIndex] > array[maxIndex])) {
                maxIndex = rightChildIndex;
            }

            if (maxIndex == parentIndex) {
                break;
            }

            int temp = array[parentIndex];
            array[parentIndex] = array[maxIndex];
            array[maxIndex] = temp;

            parentIndex = maxIndex;
        }
    }
}