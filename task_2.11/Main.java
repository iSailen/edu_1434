/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int numbers[] = {1,4,4,4,5};
        int cnt = 0;
        int total = 0;
       // boolean flag = false;
        for (int i = 0; i < numbers.length; i++) {
if (total<=10)
    {
        total=numbers[i]+total;
        cnt++;
    }
        }
        System.out.println(cnt);
        // if (flag==true) System.out.println("Да");
       // else System.out.printf("Нет");
        }
    }
