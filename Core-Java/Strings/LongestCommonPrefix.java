package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(commonPrefix(strs));
    }

    public static String commonPrefix(String[] s){
        Arrays.sort(s);
        String s1 = s[0];
        String s2 = s[s.length-1];

        int i=0;

        while(i < s1.length() && i < s2.length()){
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
            }else{
                break;
            }
        }
        return s1.substring(0,i);
    }
}

