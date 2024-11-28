package twoPointers;

public class TrappingRainWater {
    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int left = 0, right = height.length - 1, area = 0, maxLeft = height[left], maxRight = height[right];
        while (left < right) {
            if (maxLeft < maxRight) {
                left++;
                maxLeft = Math.max(maxLeft, height[left]);
                area += maxLeft - height[left];
            } else {
                right--;
                maxRight = Math.max(maxRight, height[right]);
                area += maxRight - height[right];
            }
        }
        return area;
    }
}
