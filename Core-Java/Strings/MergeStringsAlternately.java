package Strings;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        System.out.println(mergeAlternate(word1,word2));
    }

    public static String mergeAlternate(String s,String t){
        StringBuilder sb = new StringBuilder();
        int n = Math.min(s.length(),t.length());  //3

        for(int i=0;i<n;i++){
            sb.append(s.charAt(i));
            sb.append(t.charAt(i));
        }
        return sb.append(s.substring(n)).append(t.substring(n)).toString();
    }
}
