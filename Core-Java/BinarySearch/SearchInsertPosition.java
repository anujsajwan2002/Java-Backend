package BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(arr,target));
    }

    public static int searchInsert(int[] nums , int target){
        for(int i=0;i< nums.length;i++){
            if(nums[i] == target){
                return i;
            }
            if(nums[i] > target){
                return i;
            }
        }
         return nums.length;
    }
}
