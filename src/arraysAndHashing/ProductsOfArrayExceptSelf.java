package arraysAndHashing;

public class ProductsOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        var length = nums.length;
        var result = new int[length];
        var prefix = new int[length];
        var suffix = new int[length];
        prefix[0] = 1;
        suffix[length - 1] = 1;
        for (int i = 1; i < length; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }
        for (int i = length - 2; i >= 0; i--) {
            suffix[i] = nums[i + 1] * suffix[i + 1];
        }
        for (int i = 0; i < length; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }
}
