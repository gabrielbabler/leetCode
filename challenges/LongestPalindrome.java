package challenges;

public class LongestPalindrome {

    public static void main(String[] args) {
        final int longestPalindrome = longestPalindrome("abccccdd");
        System.out.println(longestPalindrome);
    }

    public static int longestPalindrome(String s) {
        int[] charCounts = new int[128]; //ASCI
        for(char c : s.toCharArray()) {
            charCounts[c]++;
        }

        int result = 0;
        for(Integer charCount : charCounts) {
            result += charCount / 2 * 2;
            if(result % 2 == 0 && charCount % 2 == 1) {
                result += 1;
            }
        }
        return result;
    }
}
