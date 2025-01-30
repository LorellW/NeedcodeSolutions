package binarySearch

class SearchInRotatedSortedArray {
    fun search(nums: IntArray, target: Int): Int {
        val pivot = findPivot(nums)
        var result = binarySearch(nums,0,pivot - 1, target)
        if (result == -1){
            result = binarySearch(nums,pivot,nums.size-1,target)
        }
        return result
    }

    private fun findPivot(nums: IntArray): Int {
        var left = 0
        var rigth = nums.size - 1
        var mid: Int
        while (left < rigth) {
            mid = (left + rigth) / 2
            if (nums[mid] > nums[rigth]) {
                left = mid + 1
            } else {
                rigth = mid
            }
        }
        return left
    }

    private fun binarySearch(nums: IntArray, left: Int, right: Int, target: Int): Int {
        var left = left
        var right = right
        var mid:Int
        while (left <= right){
            mid = (left + right) / 2
            when{
                nums[mid] > target -> right = mid -1
                nums[mid] < target -> left = mid + 1
                else -> return mid
            }
        }
        return -1
    }
}