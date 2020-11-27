/*
2.6

Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

public class Main {
    public static void main(String[] args) {
        double a = 7;
        double b = 3;
        if (a % b == 0) {
            System.out.println("Делится " + String.format("%.0f",a/b));}
        else{
            System.out.println("Делится с остатком " + String.format("%.0f",a % b));
        }

    }
}
