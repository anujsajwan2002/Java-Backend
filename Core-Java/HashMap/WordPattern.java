package HashMap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }

    public static boolean wordPattern(String pattern, String s){
        String[] arr = s.split(" ");  //to convert String into string array
        if(pattern.length() != arr.length){
            return false;
        }

        Map<Character,String> map = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            boolean containsKey = map.containsKey(ch);
            if(map.containsValue(arr[i]) && !containsKey){
                return false;
            }

            if(containsKey && !map.get(ch).equals(arr[i])){
                return false;
            }
            else{
                map.put(ch,arr[i]);
            }
        }

        return true;
    }
}
