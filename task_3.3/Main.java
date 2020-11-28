/*
3.3
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если эти числа равны - пусть функция вернет true, а если не равны - false.
*/
public class Main {
    public static boolean compare(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(compare(1, 2));
        System.out.println(compare(1, 1));
    }
}
