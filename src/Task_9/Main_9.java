// Дано целое число x, вернуть, true если x это палиндром,
// и false в противном случае.
// Можете ли вы решить эту задачу, не преобразуя целое число в строку?

package Task_9;

import java.util.Scanner;

import static Task_9.Solution_9.isPalindrome;


public class Main_9 {
    public static void main(String[] args) {
        System.out.println("Введите целое число x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
    }
}
