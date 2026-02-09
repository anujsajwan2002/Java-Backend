package Arrays;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        System.out.println(increasingTriplet(nums));
    }

        public static boolean increasingTriplet(int[] nums){
            int n1 = Integer.MAX_VALUE;
            int n2 = Integer.MAX_VALUE;

            for(int num:nums){
                if(num <= n1){
                    n1 = num;
                }else if(num <= n2){
                    n2 = num;
                }else{
                    return true;
                }
            }
            return false;
        }
}
