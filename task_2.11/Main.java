/*
2.11
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        int num=0;
        int cnt=0;
        for (int i = 0; i < numbers.length; i++) {
            num=num+numbers[i];
            if (num>10){ cnt=i+1;break;}
        }
        System.out.println(cnt);
    }

}
