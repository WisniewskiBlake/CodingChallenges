package CodingChallenges.Challenge1;

/**
 * C1Solution
 */
public class C1Solution {

    public static void main(String[] args) {
        
        int[] array = {1, 3, 6, 4, 1, 2};

        int smallest = 100000000;
        
        
        for(int i = 0; i < array.length; i++){
            int current = 0;
            int behindCurrent = 0;
            if(i == array.length - 1){
                current = array[i];
            }
            else{
                current = array[i+1];
                behindCurrent = array[i];
            }
            

            if(behindCurrent >= 1 && current >= 1 && behindCurrent <= current-2 && behindCurrent + 1 < smallest){
                smallest = behindCurrent + 1;
            }
            else if(behindCurrent >= 1 && current >= 1 && current <= behindCurrent-2 && current + 1 < smallest){
                smallest = current + 1;
            }
            else if(current == behindCurrent){
                if(current + 1 < smallest){
                    smallest = current + 1;
                }
            }

        }

        System.out.println(smallest);

    }
}