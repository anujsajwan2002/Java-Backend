package HashMap;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String , List<String>> map = new HashMap<>();
        for(String s : strs){ //Loop Through Each String
            char[] charArray = s.toCharArray();  //Convert String to Character Array
            Arrays.sort(charArray);
            String sorted = new String(charArray);  //Convert Back to String (Key)

            if(!map.containsKey(sorted)){  //Check if Key Exists
                map.put(sorted , new LinkedList<String>());
            }
            map.get(sorted).add(s);   //Add Original Word to Group
        }
        return new LinkedList<>(map.values());
    }
}
