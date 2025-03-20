/**
 * Вам даны два отсортированных связанных списка list1 и list2.
 * Объединить два списка в один отсортированный список.
 * Список должен быть создан путем сращивания первых двух списков.
 * Возвращает объединенный список начинается с dummy.next. .
 * Пример 1:
 * Вход: список1 = [1,2,4], список2 = [1,3,4]
 *  Выход: [1,1,2,3,4,4]

 * Пример 2:
 * Ввод: список1 = [], список2 = []
 *  Вывод: []

 * Пример 3:
 * Ввод: список1 = [], список2 = [0]
 *  Вывод: [0]

 * Ограничения:
 * Количество узлов в обоих списках находится в диапазоне [0, 50].
 * -100 <= Node.val <= 100

 * Оба list1 и list2 сортируются в неубывающем порядке.

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
package Task_21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static Task_21.Solution_21.mergeTwoLists;

public class Main_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество узлов списка1 в диапазоне [0, 50]");
        int x1 = sc.nextInt();
        System.out.println("Введите значения узлов списка1 >= -100 и <= 100");
        List<Integer> l1 = new LinkedList<>();
        for (int i = 0; i < x1; i++) {
            l1.add(Integer.valueOf(sc.next()));
        }

        System.out.println("Введите количество узлов списка2 в диапазоне [0, 50]");
        int x2 = sc.nextInt();
        System.out.println("Введите значения узлов списка1 >= -100 и <= 100");
        List<Integer> l2 = new LinkedList<>();
        for (int i = 0; i < x2; i++) {
            l2.add(Integer.valueOf(sc.next()));
        }


    }
}