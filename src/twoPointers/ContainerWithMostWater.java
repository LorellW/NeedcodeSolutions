package twoPointers;

public class ContainerWithMostWater {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1, amountOfWater = 0, current;
        while (i < j) {
            current = (j - i) * Math.min(heights[i], heights[j]);
            amountOfWater = Math.max(amountOfWater,current);
            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return amountOfWater;
    }
}
