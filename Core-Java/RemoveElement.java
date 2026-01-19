
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums,val));   //gives number of elements after removing the given value in the array
    }

    public static int removeElement(int[] nums,int value){
        int index = 0;
        for(int i=0; i< nums.length;i++){
            if(nums[i] != value){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
