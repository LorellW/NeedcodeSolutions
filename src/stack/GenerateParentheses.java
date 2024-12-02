package stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        var list = new ArrayList<List<String>>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        list.get(0).add("");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                var temp = new ArrayList<String>();
                for (String a: list.get(j)){
                    for (String b: list.get(i - j - 1)){
                        temp.add("(" + a + ")" + b);
                    }
                }
                list.get(i).addAll(temp);
            }
        }
        return list.get(n);
    }
}
