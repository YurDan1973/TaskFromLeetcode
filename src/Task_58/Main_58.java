/**
 * Длина последнего слова

 * Для заданной строки, s состоящей из слов и пробелов, вернуть длину последнего слова в строке.
 * Слово — это максимум подстрока состоящий только из символов, не являющихся пробелами.

 * Пример 1:
 * Ввод: s = "Hello World"
 *  Вывод: 5
 *  Пояснение: Последнее слово — "World" длиной 5.

 * Пример 2:
 * Ввод: s = "   fly me   to   the moon  "
 *  Вывод: 4
 *  Пояснение: Последнее слово - "moon" длиной 4.

 * Пример 3:
 * Ввод: s = "luffy is still joyboy"
 *  Вывод: 6
 *  Пояснение: Последнее слово — "joyboy" длиной 6.

 * Ограничения:
 * 1 <= s.length <= 104
 * s состоит только из английских букв и пробелов ' '.
 * В тексте будет как минимум одно слово s.
 */

package Task_58;

import static Task_58.Solution_58.lengthOfLastWord;

public class Main_58 {
    public static void main(String[] args) {
        String string = "I originally wrote to you that you need to check in the warranty report";
        System.out.println(lengthOfLastWord(string));
    }
}
