
public class Palindrome {
    /**
     * Palindromes are words that are the same forwards as they are backwards - eg, 'bob', 'racecar'.
     *
     * You can solve this problem in several ways:
     * You could start with a String reversal algorithm, which you have already written, and check if str is the same
     * as its reversed form, or, you could check if the character at the nth position of a String moving forwards
     * re the same as the nth position of a String moving backwards.
     *
     * @param str A String.
     * @return true if str is a palindrome, false otherwise.
     */
    public boolean pal(String str){
        if (str == null || str.isEmpty()) {
            return false; // Null or empty strings are not palindromes
        }

        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends moving towards the center
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }

        return true;
        
    }
}
