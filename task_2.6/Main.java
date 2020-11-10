/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите  число:");
        int a = 10;
        int b = 1;
        b = scanner.nextInt();
        int c;
        c = a % b;
        System.out.println(c == 0 ? "Делится" : "Делится с остатком = " +  c);
    }
}
