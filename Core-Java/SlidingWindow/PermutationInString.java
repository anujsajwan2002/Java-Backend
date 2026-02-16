package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidboaoo";
        System.out.println(premutation(s1,s2));
    }
    public static boolean premutation(String s1 ,String s2){
        if(s1.length() > s2.length()){
            return false;
        }

        Map<Character,Integer> s1Count = new HashMap<>();
        Map<Character,Integer> s2Count = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            s1Count.put(s1.charAt(i) , s1Count.getOrDefault(s1.charAt(i) ,0) + 1);
            s2Count.put(s2.charAt(i) , s2Count.getOrDefault(s2.charAt(i) ,0) + 1);
        }

        if(s1Count.equals(s2Count)){
            return true;
        }

        int left = 0;
        for(int right=s1.length();right<s2.length();right++){
            char rightChar = s2.charAt(right);
            s2Count.put(rightChar,s2Count.getOrDefault(rightChar,0) + 1);

            char leftChar = s2.charAt(left);
            s2Count.put(leftChar,s2Count.get(leftChar) - 1);
            if(s2Count.get(leftChar) == 0){
                s2Count.remove(leftChar);
            }
            left++;

            if(s1Count.equals(s2Count)){
                return true;
            }

        }
        return false;
    }
}
