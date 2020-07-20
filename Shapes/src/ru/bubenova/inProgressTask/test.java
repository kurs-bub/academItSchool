package ru.bubenova.inProgressTask;

public class test {
    public static void main(String[] args) {
        int[] array = {-3, 0, 345, -10, 1, 8, 2, 0, 632, 56, -283};

        sortArrayInAscendingOrder(array);

        System.out.println("Массив в отсортированном виде: ");

        for (int value : array) {
            System.out.printf("%4d", value);
        }
    }

    public static void siftChildren(int[] array, int index, int k) {
        while (index * 2 + 1 <= array.length - 1 - k) {
            int child1 = 2 * index + 1;
            int child2 = 2 * index + 2;

            if (child2 <= array.length - 1 - k) {
                if (array[child1] >= array[child2]) {
                    if (array[index] < array[child1]) {
                        int tmp = array[index];
                        array[index] = array[child1];
                        array[child1] = tmp;
                        index = child1;

                        continue;
                    }
                } else if (array[index] < array[child2]) {
                    int tmp = array[index];
                    array[index] = array[child2];
                    array[child2] = tmp;

                    index = child2;

                    continue;
                }
            }

            if (array[index] < array[child1]) {
                int tmp = array[index];
                array[index] = array[child1];
                array[child1] = tmp;
            }

            break;
        }
    }

    public static void sortArrayInAscendingOrder(int[] array) {
        //приводим массив к виду кучи
        int elementIndex = array.length / 2 - 1;

        for (int i = elementIndex; i >= 0; i--) {
            siftChildren(array, i, 0);
        }

        //непосредственно сортировка
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[0];
            array[0] = temp;

            siftChildren(array, 0, i + 1);
        }
    }
}