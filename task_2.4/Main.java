/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму: ");
        double sum = scanner.nextInt();
        System.out.println("Размер вашего вклада поочередно на ближайшие 5 лет: ");
        for (int i = 1; i <= 5; i++) {
            sum = sum * 1.05;
            System.out.println(sum);
        }
    }
}
