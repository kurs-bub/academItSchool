package ru.bubenova.completedTask.lesson5;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int minNumber = 1;
        int maxNumber = 100;
        int differenceBetweenBorders = maxNumber - minNumber;

        Random random = new Random();
        int randomNumber = minNumber + random.nextInt(differenceBetweenBorders + 1);

        System.out.println("Привет! Я (твой ПК) загадал число от " + minNumber + " до " + maxNumber + ". Твоя задача угадать это число. Поехали!");

        Scanner scanner = new Scanner(System.in);

        int attemptsCount = 1;

        for (; ; ) {
            System.out.println("Введи число: ");
            int userNumber = scanner.nextInt();

            if (userNumber == randomNumber) {
                System.out.println("Мои поздравления! Ты угадал!");
                System.out.println("Количество попыток - " + attemptsCount);
                break;
            }

            System.out.println("Пробуй еще, не отгадал!");

            if (userNumber > randomNumber) {
                System.out.println("Подсказка - загаданное число меньше!");
            } else {
                System.out.println("Подсказка - загаданное число больше!");
            }

            ++attemptsCount;
        }
    }
}