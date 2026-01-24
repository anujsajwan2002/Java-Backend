package HashMap;

import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaximumFrequency {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(maxFrequencyElement(nums));
    }

    public static int maxFrequencyElement(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        int freq = 0, count = 0;

        for(int num : nums){
            map.put(num , map.getOrDefault(num,0) + 1);
        }

        for(int val : map.values()){
            if(val == freq){
                count++;
            }else if(val > freq){
                freq = val;
                count = 1;
            }
        }
        return freq * count;
    }
}

//This problem asks us to find the total count of elements that appear with the maximum frequency in an array.
// We need to determine what the highest frequency is, then count how many distinct elements
// achieve that frequency, and finally multiply the frequency by the count to get the total elements.