package TwoPointers;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s){
        char[] word = s.toCharArray();
        int i = 0;
        int j = word.length-1;
        String vowels = "AIEOUaieou";

        while(i<j){
            while(i<j && vowels.indexOf(word[i]) == -1){
                i++;
            }

            while(i<j && vowels.indexOf(word[j]) == -1){
                j--;
            }

            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;

            i++;
            j--;
        }

        String ans = new String(word);
        return ans;
    }
}
