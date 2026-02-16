package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {1,2,3,2,2};
        System.out.println(totalFruits(fruits));
    }

    public static int totalFruits(int[] fruits){
        int l=0,r=0;
        int maxLen = 0;
        int n = fruits.length;

        Map<Integer,Integer> map = new HashMap<>();

        while(r < n){
            map.put(fruits[r] , map.getOrDefault(fruits[r] , 0) + 1);

            if(map.size() >= 3){
                map.put(fruits[l] , map.get(fruits[l]) - 1);
                if(map.get(fruits[l]) == 0){
                    map.remove(fruits[l]);
                }

                l++;
            }
            int currLen = r-l+1;
            maxLen = Math.max(maxLen,currLen);
            r++;
        }

        return maxLen;
    }
}
