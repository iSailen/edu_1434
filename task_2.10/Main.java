/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int nums[] = {4, 2, 6, 2, 65,65};
        String flag = "нет";
        for (int i=0; i < nums.length-1; i++){
           if (nums[i]==nums[i+1]) {flag = "да";};
        }
        System.out.println(flag);
    }
}
