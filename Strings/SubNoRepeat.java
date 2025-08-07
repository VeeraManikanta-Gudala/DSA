package Strings;

public class SubNoRepeat {
    // Function to find the longest substring without repeating characters
    public static String longestSubstringWithoutRepeating(String str) {
        int n = str.length();
        int start = 0, maxLength = 0, startIndex = 0;
        int[] lastIndex = new int[256];
        for (int i = 0; i < n; i++) {
            if (lastIndex[str.charAt(i)] > start) {
                start = lastIndex[str.charAt(i)];
            }
            lastIndex[str.charAt(i)] = i + 1; // Update last index of character
            if (i - start + 1 > maxLength) {
                maxLength = i - start + 1;
                startIndex = start;
            }
        }
        return str.substring(startIndex, startIndex + maxLength);
    }
    

    public static void main(String[] args) {
        String testString = "abcabcdbb";
        String result = longestSubstringWithoutRepeating(testString);
        System.out.println("Longest substring without repeating characters: " + result);
    }
}
