package ValidParenthesis;

import java.util.Stack;

//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//        An input string is valid if:
//
//        Open brackets must be closed by the same type of brackets.
//        Open brackets must be closed in the correct order.
//        Note that an empty string is also considered valid.
//
//        Example 1:
//
//        Input: "()"
//        Output: true
//        Example 2:
//
//        Input: "()[]{}"
//        Output: true

//O(n + m) time O(n + m) space
public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }

    public static boolean isValid(String string) {
        //go until a right parenthesis is hit
        //if the parenthesis immediatly to the left isnt matching, return false
        Stack<Character> stack = new Stack<>();
        char[] leftParens = {'(', '{', '['};
        char[] rightParens = {')', '}', ']'};
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
            if(string.charAt(i) == rightParens[0]) {
                stack.pop();
                if(stack.isEmpty() || stack.peek() != leftParens[0]) {
                    return false;
                }
                stack.pop();
            } else if(string.charAt(i) == rightParens[1]) {
                stack.pop();
                if(stack.isEmpty() || stack.peek() != leftParens[1]) {
                    return false;
                }
                stack.pop();
            } else if(string.charAt(i) == rightParens[2]) {
                stack.pop();
                if(stack.isEmpty() || stack.peek() != leftParens[2]) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
