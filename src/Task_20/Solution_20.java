package Task_20;

import java.util.Stack;

class Solution_20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c=='(' || c=='{' || c=='[') {
                // если символ - открывающая скобка, помещаем его в стек
                stack.push(c);
            } else if(!stack.isEmpty() && ((c==')' && stack.peek()=='(') || (c=='}' && stack.peek()=='{') || (c==']' && stack.peek()=='['))) {
                // если символ - закрывающая скобка и она соответствует верхней скобке в стеке, удаляем верхнюю скобку из стека
                stack.pop();
            } else {
                // иначе последовательность неправильная
                return false;
            }
        }
        return stack.isEmpty();
        // если стек пустой, то последовательность правильная
    }
}