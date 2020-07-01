package completedTask;

import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // пользователь вводит данные по дому
        System.out.print("Введите число подъездов в доме: ");
        int porchesAmount = scanner.nextInt();

        System.out.print("Введите число этажей в доме: ");
        int floorsAmount = scanner.nextInt();

        int apartmentsAmountPerFloor = 4;
        System.out.println("Количество квартир на лестничной площадке - " + apartmentsAmountPerFloor);

        // считаем количество квартир в доме
        int apartmentsAmountInHouse = apartmentsAmountPerFloor * floorsAmount * porchesAmount;
        System.out.println("Количество квартир в доме - " + apartmentsAmountInHouse);

        // пользователь вводит определенную квартиру
        System.out.print("Введите номер квартиры: ");
        int apartmentNumber = scanner.nextInt();

        // проверяем, есть ли такая квартира в доме
        if (apartmentNumber > apartmentsAmountInHouse || apartmentNumber <= 0) {
            System.out.println("Квартиры с таким номером в этом доме нет :("); // квартиры нет, уведомляем пользователя
        } else {
            // узнаем подъезд и этаж
            int porchNumber = (apartmentNumber - 1) / (floorsAmount * apartmentsAmountPerFloor) + 1;
            int floorNumber = (((apartmentNumber - 1) % (floorsAmount * apartmentsAmountPerFloor)) / apartmentsAmountPerFloor) + 1;

            System.out.print("Расположение указанной квартиры: " + porchNumber + " подъезд, " + floorNumber + " этаж, ");

            // узнаем расположение
            int apartmentLocationNumber = apartmentNumber % apartmentsAmountPerFloor;

            if ((apartmentLocationNumber == 1) || (apartmentLocationNumber == 0)) {
                System.out.print(" положение ближнее ");
            } else {
                System.out.print(" положение дальнее ");
            }

            if ((apartmentLocationNumber == 1) || (apartmentLocationNumber == 2)) {
                System.out.print("слева");
            } else {
                System.out.print("справа");
            }
        }
    }
}