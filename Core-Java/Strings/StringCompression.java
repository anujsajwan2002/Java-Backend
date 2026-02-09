package Strings;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars){
        int write = 0;
        int read = 0;

        while(read < chars.length){
            char currentChar = chars[read];
            int count = 0;
            while(read < chars.length && currentChar == chars[read]){
                read ++;
                count ++;
            }

            chars[write] = currentChar;
            write ++;
            if(count > 1){
                String str = Integer.toString(count);
                for(char s : str.toCharArray()){
                    chars[write++] = s;
                }
            }
        }
        return write;
    }
}
