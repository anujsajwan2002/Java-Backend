package Strings;

public class GreatestCommonDivisorofStrings {
    public static void main(String[] args) {
        String str1 = "ABABAB", str2 = "ABAB";
        System.out.println(GCDofStrings(str1,str2));
    }

    public static String GCDofStrings(String s,String t){
        if(!(s+t).equals(t+s)){
            return "";
        }

        int lenGCD = gcd(s.length(),t.length());
        return s.substring(0,lenGCD);

    }

    private static int gcd(int len1,int len2){ // 6, 3
        while(len2 != 0){
            int temp = len1 % len2;  //ABC = 3
            len1 = len2; // ABC = 3
            len2 = temp; // ABC = 3
        }
        return len1;
    }
}
