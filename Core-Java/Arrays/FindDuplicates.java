package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDup(nums));
    }

    public static List<Integer> findDup(int[] nums){
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            int x = Math.abs(nums[i]) - 1;

            if(nums[x] < 0){
                result.add(Math.abs(nums[i]));
            }else{
                nums[x] =-nums[x];
            }
        }
        return result;
    }
}
