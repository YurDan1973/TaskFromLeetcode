//Самый длинный общий префикс
//
//Напишите функцию для поиска самой длинной общей строки префикса среди массива строк.
//Если общего префикса нет, вернуть пустую строку "".
//
//Пример 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//
//Пример 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Пояснение: Среди входных строк нет общего префикса.
//
//Ограничения:
//        1 <= strs.length <= 200
//        0 <= strs[i].length <= 200
//strs[i] состоит только из строчных английских букв, если он не пуст.



package Task_14;

import java.util.Scanner;

public class Main_14 {
    public static void main(String[] args) {
        System.out.println("Введите число n элементов в массиве => 1 и <= 200");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Введите элементы массива длиной 0 <= и <= 200");
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.next();
        }
        System.out.println(Solution_14.longestCommonPrefix(strings));
    }
}
