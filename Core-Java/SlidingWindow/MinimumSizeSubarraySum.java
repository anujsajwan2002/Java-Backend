package SlidingWindow;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(MinSizeSubArray(nums,target));
    }

    public static int MinSizeSubArray(int[] arr , int target){
        int left=0;
        int right=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;

        while(right < arr.length){
            sum += arr[right];
            while(sum >= target){
                ans = Math.min(ans,right-left + 1);
                sum -= arr[left];
                left++;
            }
            right++;
        }
        return ans == Integer.MAX_VALUE ? 0:ans;  //minimal length of a subarray
    }
}
