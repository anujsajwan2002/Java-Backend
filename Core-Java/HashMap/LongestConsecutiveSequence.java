package HashMap;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] nums){
        Set<Integer> numSet = new HashSet<>();
        for(int i:nums){
            numSet.add(i);
        }

        int longest = 0;

        for(int num:numSet){
            if(!numSet.contains(num-1)){
                int length = 1;

                while(numSet.contains(num + length)){
                    length++;
                }

                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}
