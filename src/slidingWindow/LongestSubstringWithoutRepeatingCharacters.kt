package slidingWindow

class LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s:String):Int{
        if (s.isEmpty()) return 0
        val charSet = HashSet<Char>()
        var left = 0
        var result = 0
        for (right in s.indices){
            while (charSet.contains(s[right])){
                charSet.remove(s[left])
                left++
            }
            charSet.add(s[right])
            result = maxOf(result, right - left + 1)
        }
        return result
    }
}