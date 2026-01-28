package TwoPointers;

public class ContainerWith_Most_Water {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height){
        int l=0;
        int r=height.length-1;
        int max=0;

        while(l<=r){
            int leftPipe = height[l];
            int rightPipe = height[r];
            int minPipe = Math.min(leftPipe,rightPipe);
            max = Math.max(max,minPipe*(r-l));

            if(leftPipe < rightPipe){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
