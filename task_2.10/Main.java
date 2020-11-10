/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,4,5};
        boolean flag = false;
        for (int i = 0; i < numbers.length-1; i++) {
if (numbers[i]==numbers[i+1]) flag=true;
        }
        if (flag==true) System.out.println("Да");
        else System.out.printf("Нет");
        }
    }
