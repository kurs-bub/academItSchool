package ru.bubenova.completedTask.lesson6;

public class Overload {
    public static int getTypeSize(byte a) {
        return 1;
    }

    public static int getTypeSize(short a) {
        return 2;
    }

    public static byte getTypeSize(int a) {
        return 4;
    }

    public static int getTypeSize(long a) {
        return 8;
    }

    public static int getTypeSize(float a) {
        return 4;
    }

    public static int getTypeSize(double a) {
        return 8;
    }

    public static void main(String[] args) {
        System.out.println("Количество байт, требуемых для переменных разного типа:");

        byte b = 1;
        System.out.println(getTypeSize(b) + " байт - для типа byte");

        short s = 1;
        System.out.println(getTypeSize(s) + " байта - для типа short");

        System.out.println(getTypeSize(1) + " байта - для типа int");
        System.out.println(getTypeSize(1L) + " байт - для типа long");
        System.out.println(getTypeSize(1F) + " байта - для типа float");
        System.out.println(getTypeSize(1D) + " байт - для типа double");
    }
}