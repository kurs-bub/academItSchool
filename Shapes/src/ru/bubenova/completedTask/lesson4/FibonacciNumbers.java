package ru.bubenova.completedTask.lesson4;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер числа Фибоначчи: ");
        int fibonacciNumberIndex = scanner.nextInt();

        int fibonacciCurrentMember = 0;
        int fibonacciNextMember = 1;

        if (fibonacciNumberIndex == 0) {
            System.out.println(fibonacciCurrentMember);
        } else if (fibonacciNumberIndex == 1) {
            System.out.println(fibonacciNextMember);
        } else {
            for (int i = 1; i <= fibonacciNumberIndex; i++) {
                int fibonacciAfterNextMember = fibonacciCurrentMember + fibonacciNextMember;
                fibonacciCurrentMember = fibonacciNextMember;
                fibonacciNextMember = fibonacciAfterNextMember;
            }

            System.out.println(fibonacciNumberIndex + "-ый член ряда Фибоначчи равен: " + fibonacciCurrentMember);
        }
    }
}