package ru.bubenova.completedTask.lesson9;

import java.util.Arrays;

public class RevertArray {
    public static void main(String[] args) {
        int[] array = {1, 5, 10, 6, 7, 4, 22};

        revertArray(array);

        System.out.println(Arrays.toString(array));
    }

    public static void revertArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length / 2; i++) {
            int temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - i - 1];
            inputArray[inputArray.length - i - 1] = temp;
        }
    }
}
