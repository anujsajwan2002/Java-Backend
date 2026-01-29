package TwoPointers;

import java.util.Arrays;

public class TwoSum_II {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] arr,int target){
        int i=0;
        int j=arr.length-1;

        while(arr[i] + arr[j] != target){
            if(arr[i] + arr[j] < target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{i+1,j+1};
    }
}
