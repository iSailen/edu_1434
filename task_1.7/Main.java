/* Задача наполнить корабельный бассейн. Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
Эти размеры передаются запрашиваются у пользователя. Прграмма должена вывести на экран количество литров воды,
которое нужно для наполнения бассейна.
Пример:
Пользователь даёт числа 25, 5, 2.
Пример вывода:
250000 */

 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
        System.out.println("Enter first size");
                int a = scan.nextInt();
        System.out.println("Enter second size");
                int b = scan.nextInt();
        System.out.println("Enter thrid size");
                int c = scan.nextInt();
        System.out.println("Result");
        System.out.println(a*b*c*1000);

         }
}
