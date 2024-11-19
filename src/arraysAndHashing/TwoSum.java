package arraysAndHashing;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        var temp = new HashMap<Integer, Integer>();
        temp.put(target - nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (temp.containsKey(nums[i])) {
                return new int[]{temp.get(nums[i]), i};
            } else if (!temp.containsKey(target - nums[i])){
                temp.put(target - nums[i], i);
            }
        }
        return null;
    }
}
