/**
 * Дано неотрицательное целое число x, вернуть квадратный корень x округленного вниз до ближайшего целого числа .
 * Возвращаемое целое число также должно быть неотрицательным.
 * Не допускается использование встроенных функций или операторов экспоненты.
 * Например, не используйте pow(x, 5).

 * Пример 1:
 * Вход: x = 4
 *  Выход: 2
 *  Пояснение: Квадратный корень из 4 равен 2, поэтому мы возвращаем 2.

 * Пример 2:
 * Ввод: x = 8
 *  Вывод: 2
 *  Пояснение: Квадратный корень из 8 равен 2,82842..., и поскольку мы округляем его до ближайшего целого числа, возвращается 2.

 * Ограничения:

 * 0 <= x <= 2^31 - 1
 */

package Task_69;

import java.util.Scanner;

public class Main_69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter non-negative number: ");
        int n = sc.nextInt();
        int m;
        if (n >= 0 || n <= Math.pow(n, 31) - 1) {
            m = Solution_69.mySqrt(n);
            System.out.println(m);
        } else {
            System.out.println("The entered number must be non-negative!");
        }

    }
}
