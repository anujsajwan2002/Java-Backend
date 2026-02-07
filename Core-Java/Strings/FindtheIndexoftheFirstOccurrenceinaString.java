package Strings;

public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        String haystack = "leetcode", needle = "leeto";
        System.out.println(StrStr(haystack,needle));
    }

    public static int StrStr(String haystack, String needle){
        if(haystack.length() < needle.length()){
            return -1;
        }

        int length = haystack.length() - needle.length();  //9-3 = 6

        for(int i=0;i<=length;i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
