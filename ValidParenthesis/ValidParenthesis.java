package ValidParenthesis;

public class ValidParenthesis {
    public static void main(String[] args) {

    }

    public static boolean isValid(String string) {
        //go until a right parenthesis is hit
        //if the parenthesis immediatly to the left isnt matching, return false
        char[] leftParens = {'(', '{', '['};
        char[] rightParens = {')', '}', ']'};
        int leftCounter = 0;
        int rightCounter = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == rightParens[0]) {
                rightCounter++;
            } else if(string.charAt(i) == rightParens[1]) {
                rightCounter++;
            } else if(string.charAt(i) == rightParens[2]) {
                rightCounter++;
            }

            if(string.charAt(i) == leftParens[0]) {
                leftCounter++;
            } else if(string.charAt(i) == leftParens[1]) {
                leftCounter++;
            } else if(string.charAt(i) == leftParens[2]) {
                leftCounter++;
            }
        }
        if(leftCounter != rightCounter) {
            return false;
        }
        return false;
    }
}
