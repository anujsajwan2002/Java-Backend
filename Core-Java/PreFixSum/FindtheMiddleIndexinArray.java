package PreFixSum;

import java.util.Arrays;

public class FindtheMiddleIndexinArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-1,8,4};
        System.out.println(findMiddleIndex(arr));
    }
    public static int findMiddleIndex(int[] nums){
        int total = 0;
        for(int num : nums){
            total += num;
        }

        int left = 0;
        for(int i=0;i<nums.length;i++){
            if(left == total-left-nums[i]){
                return i;
            }

            left += nums[i];
        }
        return -1;
    }
}
