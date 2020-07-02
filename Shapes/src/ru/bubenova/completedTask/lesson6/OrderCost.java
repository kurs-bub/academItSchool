package ru.bubenova.completedTask.lesson6;

import java.util.Scanner;

public class OrderCost {
    public static double getOrderCost(int product1Count, double product1Cost, int product2Count, double product2Cost) {
        double orderCost = product1Cost * product1Count + product2Cost * product2Count;
        int totalProductsCount = product1Count + product2Count;

        final double allConditionsAreSatisfiedDiscountAmount = 0.1;
        final double oneConditionIsSatisfiedDiscountAmount = 0.05;

        final int minProductsCountForDiscount = 10;
        final int minProductsCostForDiscount = 1000;

        if ((totalProductsCount >= minProductsCountForDiscount) && orderCost >= minProductsCostForDiscount) {
            return orderCost - orderCost * allConditionsAreSatisfiedDiscountAmount;
        }

        if (orderCost >= minProductsCostForDiscount || (totalProductsCount >= minProductsCountForDiscount)) {
            return orderCost - orderCost * oneConditionIsSatisfiedDiscountAmount;
        }

        return orderCost;
    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в магазин \"Два товара\"!");
        System.out.println("Здесь вы можете заказать: ");
        System.out.println("-- первый товар");
        System.out.println("-- второй товар");
        System.out.println("Цены назначаете сами!");
        System.out.println("!!! С 4 по 20 мая действуют скидки - ");
        System.out.println("5% скидки вы можете получить, если сумма Вашей покупки будет не менее 1000 рублей");
        System.out.println("или если вы закажете не менее 10 товаров в одном чеке.");
        System.out.println("Приятные новости не заканчиваются! Вы можете получить целых 10% скидки, если выполните оба условия!!!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Какое количество первого товара вы хотите приобрести?");
        int product1Count = scanner.nextInt();

        System.out.println("Введите цену первого товара: ");
        double product1Cost = scanner.nextDouble();

        System.out.println("Какое количество второго товара вы хотите приобрести?");
        int product2Count = scanner.nextInt();

        System.out.println("Введите цену  второго товара: ");
        double product2Cost = scanner.nextDouble();

        System.out.print("Вы заказали " + product1Count + " ед. первого товара");
        System.out.println(" и " + product2Count + " ед. второго товара");
        System.out.println("Сумма заказа составила: " + getOrderCost(product1Count, product1Cost, product2Count, product2Cost) + " рублей");
        System.out.println("Благодарим за покупку!");
    }
}