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

    public static void checkChangeChildren(int[] array, int i, int a) {
        int child1 = 2 * i + 1;
        int child2 = 2 * i + 2;

        if (child1 <= array.length - 1 - a) {
            if (child2 <= array.length - 1 - a) {
                if (array[child1] >= array[child2]) {
                    if (array[i] < array[child1]) {
                        int temp = array[i];
                        array[i] = array[child1];
                        array[child1] = temp;

                        checkChangeChildren(array, child1, a);
                    }
                }

                if (array[i] < array[child2]) {
                    int temp = array[i];
                    array[i] = array[child2];
                    array[child2] = temp;

                    checkChangeChildren(array, child2, a);
                }
            }

            if (array[i] < array[child1]) {
                int temp = array[i];
                array[i] = array[child1];
                array[child1] = temp;

                checkChangeChildren(array, 2 * i + 1, a);
            }
        }
    }

    public static void sortArrayInAscendingOrder(int[] array) {
        int elementIndex = array.length / 2 - 1;

        for (int i = elementIndex; i >= 0; i--) {
            checkChangeChildren(array, i, 0);
        }

        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[0];
            array[0] = temp;

            checkChangeChildren(array, 0, i + 1);
        }
    }
}