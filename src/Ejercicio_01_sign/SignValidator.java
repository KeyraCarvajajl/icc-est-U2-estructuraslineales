package Ejercicio_01_sign;

import java.util.Stack;

public class SignValidator {
    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            switch (ch) {
                case '(': case '{': case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
