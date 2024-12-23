package stack;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        var result = new int[temperatures.length];
        var stack = new Stack<int[]>();
        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            while (!stack.isEmpty() && temp > stack.peek()[1]) {
                int[] pair = stack.pop();
                result[pair[0]] = i - pair[0];
            }
            stack.push(new int[]{i, temp});
        }
        return result;
    }
}
