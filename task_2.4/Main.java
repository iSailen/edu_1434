/*
2.4
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        double deposit = scan.nextDouble();
        System.out.println("Введите % доходности годовой: ");
        double interest = scan.nextDouble();
        for (int i = 1;i<=5;i++) {
            deposit=deposit+(deposit*(interest/100));

            System.out.println("Сумма вклада после "+i+" года составляет: "+String.format("%.2f",deposit));
        }


    }
}
