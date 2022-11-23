package Phonebook;

import java.util.Scanner;

public class view {

    public void menu() {

        System.out.println("Добро пожаловать в телефонный справочник!\n");
        System.out.println("Выберете опцию: \n");
        System.out.println("1: Показать все записи");
        System.out.println("2. Найти пользвателя по имени");
        System.out.println("3. Найти пользвателя по телефону");
        System.out.println("4. Выйти \n");

        Scanner scanner = new Scanner(System.in);
        int option;

        do {

            option = scanner.nextInt();
            if (option == 1) {
                new Import().read();
            } else if (option == 2) {
                System.out.println("Введите имя: ");

                // нужно использовать метод SearchbyName
            } else if (option == 3) {
                System.out.println("Введите номер телефона: ");

                //// нужно использовать метод SearchbyPhone
            } else if (option != 4) {
                System.out.println("Введите число от 1 до 4 : ");

            }
        } while (option != 4);

        System.out.println("Выход");
        scanner.close();
    }
}
