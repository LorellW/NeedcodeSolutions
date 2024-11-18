package arraysAndHashing;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        var temp = new HashMap<Character, Integer>();
        for (char current : s.toCharArray()) {
            if (temp.containsKey(current)) {
                temp.replace(current, temp.get(current) + 1);
            } else {
                temp.put(current, 1);
            }
        }
        for (char current : t.toCharArray()) {
            if (!temp.containsKey(current)){
                return false;
            }else {
                int value = temp.get(current) - 1;
                if (value < 0){
                    return false;
                }
                temp.replace(current,value);
            }
        }
        return temp.values().stream().allMatch(integer -> integer == 0);
    }
}
