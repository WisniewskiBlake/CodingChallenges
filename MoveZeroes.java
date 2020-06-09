//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//        Example:
//
//        Input: [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//        Note:
//
//        You must do this in-place without making a copy of the array.
//        Minimize the total number of operations.


public class MoveZeroes {
    public static void main(String[] args) {

    }

    public static void moveZeroes(int[] nums) {
        int idx = nums.length -1;
        int count = 0;
        if(idx>0){
            for(int x=0; x<=idx; x++){
                if(nums[x]!=0){
                    nums[count]=nums[x];
                    if(count!=x) {
                        nums[x]=0;
                    }
                    count++;
                }
            }
        }
    }

    public static void moveZeroes1(int[] nums) {
        int zeroCount = 0;
        int currentIndex = 0;
        for (int i =0; i < nums.length; i++){
            if (nums[i] == 0){
                zeroCount++;
            }
            else{
                nums[currentIndex] = nums[i];
                currentIndex++;
            }
        }

    }

}
