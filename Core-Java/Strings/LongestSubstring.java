package Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println("Longest substring of length : " + lengthOfLongestSubString(s));
    }

    public static int lengthOfLongestSubString(String s){   //use of set and hashset

        Set<Character> box = new HashSet<>();

        int right = 0;
        int left = 0;
        int maxLen = 0;

        while(right < s.length()){
            if(!box.contains(s.charAt(right))){
                box.add(s.charAt(right));
                maxLen = Math.max(maxLen , right-left+1);
                right++;
            }else{
                box.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}
