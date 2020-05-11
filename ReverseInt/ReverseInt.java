package ReverseInt;

public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(reverseNaive(123));
    }

    public static int reverseNaive(int x) {
        //convert to string
        String y = Integer.toString(x);
        int p = y.length();
        int result = 0;
        
        //for loop through y and use .charAt(i) to access element
        for (int i = p; i > 0; i--) {
            result += Integer.parseInt(String.valueOf(y.charAt(i)));
        }
        //create partition from middle

        if(y.length() % 2 == 0) {

        }else {
            
        }

        return x;
    }
}
