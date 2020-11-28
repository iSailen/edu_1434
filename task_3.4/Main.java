/*
3.4
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
*/
public class Main {
    public static boolean fun34(int a, int b) {
        if (a+b>10){return true;}
        else {return false;}
    }
    public static void main(String[] args) {
        System.out.println(fun34(1,8));
        System.out.println(fun34(5,8));
    }
}
