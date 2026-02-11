package PreFixSum;

public class FindPivot {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(pivot(nums));
    }

    public static int pivot(int[] nums){
        int total = 0;
        for(int num : nums){
            total = total + num;
        }

        int leftTotal = 0;
        for(int i=0;i< nums.length;i++){
            int rightTotal = total - leftTotal - nums[i];
            if(rightTotal == leftTotal){
                return i;
            }

            leftTotal += nums[i];
        }

        return -1;
    }
}
