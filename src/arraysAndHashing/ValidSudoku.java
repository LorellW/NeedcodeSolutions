package arraysAndHashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        var rows = new HashMap<Integer, HashSet<Character>>();
        var columns = new HashMap<Integer, HashSet<Character>>();
        var squares = new HashMap<String, HashSet<Character>>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                var current = board[i][j];
                if (current == '.') {
                    continue;
                }
                String squareKey = (i / 3) + "," + (j / 3);
                if (rows.computeIfAbsent(i, k -> new HashSet<>()).contains(current) ||
                columns.computeIfAbsent(j, k ->new HashSet<>()).contains(current)||
                squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(current)){
                    return false;
                }
                rows.get(i).add(current);
                columns.get(j).add(current);
                squares.get(squareKey).add(current);
            }
        }
        return true;
    }
}
