package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(arr,k));
    }

    //Given an integer array nums and an integer k,
    // return true if there are two distinct indices i and j in the array
    // such that nums[i] == nums[j] and abs(i - j) <= k.

    public static boolean containsNearbyDuplicate(int[] nums ,int k){
        Map<Integer , Integer> map = new HashMap<>();

        int n = nums.length;
        for(int i=0; i<n; i++){
            int val = nums[i];
            if(map.containsKey(val) && i-map.get(val) <= k){  //Is the distance between the current index i and the previous index of this same number ≤ k?
                return true;
            }
            map.put(val,i); //i is index value
        }
        return false;
    }
}
