package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {  //Longest Substring Without Repeating Characters
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfSubString(s));
    }

    public static int lengthOfSubString(String s){
        Set<Character> box = new HashSet<>();

        int left=0;
        int right=0;
        int maxLen=0;

        while(right < s.length()){
            if(!box.contains(s.charAt(right))){
                box.add(s.charAt(right));
                maxLen = Math.max(maxLen,right-left+1);
                right++;
            }else{
                box.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}
