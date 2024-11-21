package arraysAndHashing;

import java.lang.reflect.Array;
import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 0) {
            result.add(List.of(""));
            return result;
        }
        if (strs.length == 1) {
            result.add(List.of(strs[0]));
            return result;
        }
        var map = new HashMap<List<Integer>, List<String>>();
        for (String str : strs) {
            List<Integer> temp = stringToArray(str);
            if (!map.containsKey(temp)) {
                map.put(temp, new ArrayList<>());
            }
            map.get(temp).add(str);
        }
        result.addAll(map.values());
        return result;
    }

    public static List<Integer> stringToArray(String str) {
        int[] result = new int[26];
        for (char current : str.toCharArray()) {
            result[current - 97]++;
        }
        return Arrays.stream(result).boxed().toList();
    }
}
