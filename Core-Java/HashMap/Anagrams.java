package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        String s =  "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);                            //We process the string character by character.
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch) || map.get(ch) == 0){   //if character doesn’t exist OR count is already 0 Then t has an extra character → not an anagram
                return false;
            }

            map.put(ch,map.get(ch)- 1);  //We reduce the frequency because we’ve matched one occurrence.
        }

        return true;
    }
}
