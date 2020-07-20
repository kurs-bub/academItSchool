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

    public static void siftChildren(int[] array, int length, int i) {
        int child1 = 2 * i + 1;
        int child2 = 2 * i + 2;

        if (child1 <= array.length - 1 - i) {
            if (child2 <= array.length - 1 - i) {
                if (array[child1] >= array[child2]) {
                    if (array[i] < array[child1]) {
                        int temp = array[i];
                        array[i] = array[child1];
                        array[child1] = temp;

                        siftChildren(array, child1, i);
                    }
                }

                if (array[i] < array[child2]) {
                    int temp = array[i];
                    array[i] = array[child2];
                    array[child2] = temp;

                    siftChildren(array, child2, i);
                }
            }

            if (array[i] < array[child1]) {
                int temp = array[i];
                array[i] = array[child1];
                array[child1] = temp;

                siftChildren(array, 2 * i + 1, i);
            }
        }
    }

    public static void sortArrayInAscendingOrder(int[] array) {
        if (array.length == 0) {
            return;
        }

        //строим кучу, проходим от первого без ответвлений к корню
        int elementIndex = array.length / 2 - 1;

        for (int i = elementIndex; i >= 0; i--) {
            siftChildren(array, array.length, i);
        }

        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[0];
            array[0] = temp;

            siftChildren(array, 0, i + 1);
        }
    }
}