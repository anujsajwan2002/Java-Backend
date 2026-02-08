package Arrays;


import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] ans = new int[n]; //empty array

        int left = 1;
        int right = 1;

        for(int i=n-1;i>=0;i--){
            ans[i] = right; // [0,0,0,1]    final : [24,12,4,1]
            right = right * nums[i]; //right = 1*4 = 4
        }

        for(int i=0;i<n;i++){
            ans[i] = left * ans[i];  // 1 * 24 = 24  ,12 , 8 , 6
            left = left * nums[i];   // 1*1 = 1   , 2   ,  6 , 24
        }

        return ans;
    }
}
