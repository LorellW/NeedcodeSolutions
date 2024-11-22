package arraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();
        List<Integer>[] lists = new List[nums.length + 1];
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList<>();
        }
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            lists[entry.getValue()].add(entry.getKey());
        }
        int[] result = new int[k];
        int i = 0;
        for (int j = lists.length - 1; j > 0 && i < k; j--) {
            for (int n : lists[j]) {
                result[i++] = n;
                if (i == k){
                    break;
                }
            }
        }
        return result;
    }
}
