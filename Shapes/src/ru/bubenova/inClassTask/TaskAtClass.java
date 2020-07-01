package ru.bubenova.inClassTask;

public class TaskAtClass {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            stringBuilder.append(i).append(", ");
        }

        int length = stringBuilder.length();
        int startIndex = length - 2;
        int endIndex = length - 1;

        stringBuilder.delete(startIndex, endIndex);

        String result = stringBuilder.toString();
        System.out.println(result);
    }
}
