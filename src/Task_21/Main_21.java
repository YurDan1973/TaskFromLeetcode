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

import java.util.Scanner;

public class Main_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Список 1
        System.out.println("Введите количество узлов списка1 в диапазоне [0, 50]");
        int x1 = sc.nextInt();
        ListNode ln1 = null, tail1 = null;

        System.out.println("Введите значения узлов списка1 >= -100 и <= 100");
        for (int i = 0; i < x1; i++) {
            int value = Integer.parseInt(sc.next());
            ListNode newNode = new ListNode(value);
            if (ln1 == null) {
                ln1 = newNode; // Если это первый элемент
                tail1 = ln1;   // Устанавливаем хвост
            } else {
                tail1.next = newNode; // Присоединяем новый узел
                tail1 = newNode;       // Обновляем хвост
            }
        }

        // Список 2
        System.out.println("Введите количество узлов списка2 в диапазоне [0, 50]");
        int x2 = sc.nextInt();
        ListNode ln2 = null, tail2 = null;

        System.out.println("Введите значения узлов списка2 >= -100 и <= 100");
        for (int i = 0; i < x2; i++) {
            int value = Integer.parseInt(sc.next());
            ListNode newNode = new ListNode(value);
            if (ln2 == null) {
                ln2 = newNode; // Если это первый элемент
                tail2 = ln2;   // Устанавливаем хвост
            } else {
                tail2.next = newNode; // Присоединяем новый узел
                tail2 = newNode;       // Обновляем хвост
            }
        }

        // Объединение списков и вывод результата
        ListNode mergedList = Solution_21.mergeTwoLists(ln1, ln2);
        System.out.println(listToString(mergedList));
    }

    public static String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (head != null) {
            sb.append(head.val);
            head = head.next;
            if (head != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

