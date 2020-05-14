package ReverseString;

public class ReverseString {
    public static void main(String[] args) {
        String[] input = {"h", "e", "l", "l", "o"};
        String[] output = solve(input);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

    }

    public static String[] solve(String[] stringArray) {
        int size = stringArray.length - 1;
        for (int i = 0; i < stringArray.length/2; i++) {

            String temp = stringArray[i];
            stringArray[i] = stringArray[size];
            stringArray[size] = temp;
            size--;
        }
        return stringArray;
    }
}
