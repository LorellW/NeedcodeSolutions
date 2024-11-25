package arraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append("|").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        var result = new ArrayList<String>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '|') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            result.add(str.substring(i, j));
            i = j;
        }
        return result;
    }
}
