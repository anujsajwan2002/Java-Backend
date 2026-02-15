package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MaximumSumofDistinctSubarraysWithLengthK {
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maxSubarraySum(nums ,k));
    }

    public static long maxSubarraySum(int[] nums, int k){
//        The length of the subarray is k, and
//All the elements of the subarray are distinct.
        Map<Integer,Integer> map = new HashMap<>();
        int l=0;  //left pointer
        int sum = 0;  //window sum
        int max = 0; //Maximum window sum
        int r;   //right pointer

        for(r=0;r<nums.length;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0) + 1);
            sum += nums[r];

            if(r - l + 1 > k){     //check the window size
                map.put(nums[l] , map.get(nums[l]) - 1);
                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                }
                sum -= nums[l];
                l++;
            }

            if(map.size() == k && r-l+1 == k){
                 max = Math.max(sum,max);
            }
        }
        return max;
    }
}
