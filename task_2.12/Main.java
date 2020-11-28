/*
2.12
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
 Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a[] = {2,4,4,4,8,8,4,12,12,14};
        int b[] = new int[10];
        int cnt = 1;
        int lastmax = 0;
        int[]c = new int[a.length+b.length];
        int count = 0;
        for(int i = 0; i < b.length; i++)
        {
            System.out.print("Введите число["+i+"]: ");
            Scanner scanner = new Scanner(System.in);
            b[i] = scanner.nextInt();
        }
        for(int i = 0; i<a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for(int j = 0;j<b.length;j++) {
            c[count++] = b[j];
        }
        
        for (int i = 0; i < c.length-1; i++) {

            if (c[i]==c[i+1])
            {
                cnt++;
            }
            if (cnt>lastmax)
            {
                lastmax = cnt;
            }
            if (c[i] != c[i+1]) {cnt=1;}
        }
        System.out.println(lastmax);
    }
}
