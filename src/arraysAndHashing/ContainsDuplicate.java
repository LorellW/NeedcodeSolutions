package arraysAndHashing;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        var temp = new HashSet<Integer>();
        for(int i: nums){
            if(!temp.add(i)){
                return false;
            }
        }
        return true;
    }
}
