/*
Задание: Запросить у пользователя ввод числа и сохранить это число в переменную a.Если переменная a равна 10, то выведите 'Верно', иначе выведите 'Неверно'.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myscan = new Scanner (System.in);
        System.out.print("Введите число: ");
        int a = 10;
        int b = 0;
        b = myscan.nextInt();
        System.out.println(a==b ? "Верно" : "Неверно");
    }
}
