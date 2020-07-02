package ru.bubenova.completedTask.lesson6;

import java.util.Scanner;

public class PrintAndRead {
    public static int printAndRead(String textInputInvitation) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(textInputInvitation);

        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int cucumberCount = printAndRead("Сколько огурцов вы хотите посадить в этом дачном сезоне (введите число)?");
        int tomatoCount = printAndRead("Сколько томатов вы хотите посадить (введите число)?");
        int pepperCount = printAndRead("А перцев (введите число)?");

        System.out.println("В этом сезоне вы хотите посадить следующее количество корней растений: ");
        System.out.println(cucumberCount + " - огурчик");
        System.out.println(tomatoCount + " - томат");
        System.out.println(pepperCount + " - перчик");
    }
}