package ValidParenthesis;

public class ValidParenthesis {
    public static void main(String[] args) {

    }

    public static boolean isValid(String string) {
        //go until a right parenthesis is hit
        //if the parenthesis immediatly to the left isnt matching, return false
        String[] leftParens = {"(", "{", "["};
        String[] rightParens = {")", "}", "]"};
        int leftCounter = 0;
        int rightCounter = 0;
        for (int i = 0; i < string.length(); i++) {

        }
    }
}
