package binarySearch;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while (i >= 0 && j < matrix[0].length){
            if (target > matrix[i][j]){
                j++;
            } else if (target < matrix[i][j]) {
                i--;
            }else return true;
        }
        return false;
    }
}
