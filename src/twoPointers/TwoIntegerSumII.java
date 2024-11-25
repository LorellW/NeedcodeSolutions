package twoPointers;

public class TwoIntegerSumII {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int currentSum;
        do {
            currentSum = numbers[i] + numbers[j];
            if (currentSum < target) {
                i++;
            }
            if (currentSum > target) {
                j--;
            }
        } while (currentSum != target);
        return new int[]{i + 1, j + 1}; //1-indexed
    }
}
