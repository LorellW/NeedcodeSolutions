public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        int start = 0;
        int end = s.length() - 1;
        String lowerS = s.toLowerCase();
        while (start < end){
            if (!Character.isLetterOrDigit(lowerS.charAt(start))){
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(lowerS.charAt(end))){
                end--;
                continue;
            }
            if (lowerS.charAt(start) != lowerS.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
