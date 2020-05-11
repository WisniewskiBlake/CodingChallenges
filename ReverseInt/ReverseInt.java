package ReverseInt;

public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(reverseClean(54));
    }

    public static int reverseClean(int x) {
        long reverse = 0;
        int digit;

        if(x < 0) {
            x = x * -1;
            while(x > 0) {
                digit = x % 10;
                reverse = reverse * 10 + digit;
                if(reverse > Integer.MAX_VALUE) {
                    return 0;
                }
                x = x / 10;
            }
            return (int)(reverse * -1);
        }else {
            while(x > 0) {
                digit = x % 10;

                reverse = (reverse * 10);

                if(reverse > Integer.MAX_VALUE) {
                    return 0;
                }

                reverse += digit;
                x = x / 10;
            }
            return (int)reverse;
        }
    }
}
