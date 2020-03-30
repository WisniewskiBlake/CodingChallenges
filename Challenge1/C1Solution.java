package CodingChallenges.Challenge1;

/**
 * C1Solution
 */
public class C1Solution {

    public static void main(String[] args) {
        
        int[] array = {1, 3, 6, 4, 1, 2};

        int smallest;
        int current;
        int behindCurrent;
        
        for(int i = 0; i < array.length; i++){
            current = array[i+1];
            behindCurrent = array[i];

            if(behindCurrent >= 1 && current >= 1 && behindCurrent <= current-2){
                smallest = behindCurrent + 1;
            }
            else if(behindCurrent >= 1 && current >= 1 && current <= behindCurrent-2){
                
            }

        }

    }
}