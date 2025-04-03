/**
 * Для двух строк первой (haystack) и второй (needle) вернуть индекс первого вхождения второй строки в первую,
 * или , -1 если вторая не является частью первой.

 * Пример 1:
 * Ввод: первая = "sadbutsad", вторая = "sad"
 *  Вывод: 0
 *  Пояснение: "sad" встречается в индексах 0 и 6.
 * Первое вхождение находится в индексе 0, поэтому мы возвращаем 0.

 * Пример 2:
 * Ввод: первая = "leetcode", вторая = "leeto"
 *  Вывод: -1
 *  Пояснение: "leeto" не встречается в "leetcode", поэтому мы возвращаем -1.

 * Ограничения:

 * 1 <= haystack.length, needle.length <= 104
 * haystack и needle состоят только из строчных английских букв.
 */

package Task_28;

import static Task_28.Solution_28.strStr;

public class Main_28 {
    public static void main(String[] args) {
        String firstString = "davesadbutsad";
        String secondString = "sad";
        int x = strStr(firstString, secondString);
        System.out.println(x);

    }
}
