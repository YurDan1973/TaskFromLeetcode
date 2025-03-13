package Task_1;
//        СУММА ДВУХ
//
//        Дан массив целых чисел nums и целое число target, вернуть индексы двух чисел, чтобы их сумма давала target.
//        Вы можете предположить, что каждый вход будет иметь ровно одно решение, и вы не можете использовать один и тот же элемент дважды.
//        Вы можете возвращать ответ в любом порядке.
//
//        Пример 1:
//        Ввод: nums = [2,7,11,15], target = 9
//        Вывод: [0,1]
//        Пояснение: Поскольку nums[0] + nums[1] == 9, мы возвращаем [0, 1].
//
//        Пример 2:
//        Ввод: числа = [3,2,4], target = 6
//        Вывод: [1,2]
//
//        Пример 3:
//        Ввод: числа = [3,3], target = 6
//        Вывод: [0,1]

//        Ограничения:
//        2 <= nums.length <= 10000
//        -1000000000 <= nums[i] <= 1000000000
//        -1000000000 <= target <= 1000000000



import java.util.Arrays;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число len - размер массива.");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        System.out.println("Введите " + len + " чисел (числа).");
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Введите число target.");
        int target = scanner.nextInt();
        int[] A =  Solution_1.twoSum(nums, target);
        System.out.println(Arrays.toString(A));
    }
}