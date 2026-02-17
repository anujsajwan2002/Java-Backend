package SlidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(charReplacement(s,k));
    }

    public static int charReplacement(String s,int k){
        HashMap<Character,Integer> freq = new HashMap<>();
        int i=0;
        int maxFreq = 0;
        int result = 0;

        for(int j=0;j<s.length();j++){   // j keeps on iterating
            freq.put(s.charAt(j),freq.getOrDefault(s.charAt(j),0) + 1);
            maxFreq = Math.max(maxFreq,freq.get(s.charAt(j)));

            while((j-i+1) - maxFreq > k){    //window size (j-i+1)
                char left = s.charAt(i);  //i=0
                freq.put(left,freq.get(left) - 1);
                i++;
            }
            result = Math.max(result,j-i+1);
        }
        return result;
    }
}
