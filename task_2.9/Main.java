/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};
        boolean flag = false;
        int itogo =1;
        for (int i = 0; i < numbers.length; i++) {
if (numbers[i]==5) flag=true;
        }
        if (flag==true) System.out.println("Да");
        else System.out.printf("Нет");
        }
    }
