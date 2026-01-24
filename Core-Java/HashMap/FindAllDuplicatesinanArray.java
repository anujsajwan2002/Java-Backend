package HashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicatesinanArray {
    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums){
       Set<Integer> visited = new HashSet<>();
       List<Integer> duplicates = new ArrayList<>();

       for(int num : nums){
           if(visited.contains(num)){  //phele duplicate check krlia
               duplicates.add(num);
           }else{
               visited.add(num);    //agr unique value hai to visted me add krdo
           }
       }
       return duplicates;
    }
}
