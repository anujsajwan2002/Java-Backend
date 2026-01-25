package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        int candidate = 0;
        int count = 0;

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);  //frequency counter and get(Key) = values gives values
            if(map.get(num) > count){
                candidate = num;
                count = map.get(num);
            }
        }
        return candidate;
    }
}
