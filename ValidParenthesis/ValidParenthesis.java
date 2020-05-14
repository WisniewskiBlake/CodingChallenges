package ValidParenthesis;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("()()()()"));
    }

    public static boolean isValid(String string) {
        //go until a right parenthesis is hit
        //if the parenthesis immediatly to the left isnt matching, return false
        Stack<Character> stack = new Stack<>();
        char[] leftParens = {'(', '{', '['};
        char[] rightParens = {')', '}', ']'};
        int leftCounter = 0;
        int rightCounter = 0;
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
//            if(string.charAt(i) == leftParens[0]) {
//                leftCounter++;
//            } else if(string.charAt(i) == leftParens[1]) {
//                leftCounter++;
//            } else if(string.charAt(i) == leftParens[2]) {
//                leftCounter++;
//            }

            if(string.charAt(i) == rightParens[0]) {
                stack.pop();
                if(stack.peek() != leftParens[0]) {
                    return false;
                }
                stack.pop();
            } else if(string.charAt(i) == rightParens[1]) {
                stack.pop();
                if(stack.peek() != leftParens[1]) {
                    return false;
                }
                stack.pop();
            } else if(string.charAt(i) == rightParens[2]) {
                stack.pop();
                if(stack.peek() != leftParens[2]) {
                    return false;
                }
                stack.pop();
            }


        }

        return true;
    }
}
