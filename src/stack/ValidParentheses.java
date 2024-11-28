package stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        var temp = new Stack<Character>();
        var map = new HashMap<Character, Character>() {{
            put('(', ')');
            put('{', '}');
            put('[', ']');
        }};
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (map.containsKey(current)) {
                temp.push(current);
            } else if (temp.isEmpty() || map.get(temp.pop()) != current) {
                return false;
            }
        }
        return temp.isEmpty();
    }
}
