package leetcode;

import java.util.Arrays;
import java.util.HashSet;

/*
 * [345] Reverse Vowels of a String
 *
 * https://leetcode.com/problems/reverse-vowels-of-a-string/description/
 *
 * algorithms
 * Easy (39.90%)
 * Total Accepted:    124.7K
 * Total Submissions: 312.5K
 * Testcase Example:  '"hello"'
 *
 * Write a function that takes a string as input and reverse only the vowels of
 * a string.
 *
 * Example 1:
 *
 *
 * Input: "hello"
 * Output: "holle"
 *
 *
 *
 * Example 2:
 *
 *
 * Input: "leetcode"
 * Output: "leotcede"
 *
 *
 * Note:
 * The vowels does not include the letter "y".
 *
 *
 *
 */
class ReverseVowels {
    public static String reverseVowels(String s) {
        StringBuilder word = new StringBuilder(s);
        int i = 0, j = word.length() - 1;
        while (i < j) {
            while (!isVowel(word.charAt(i)) && i < j) {
                i++;
            }

            while (!isVowel(word.charAt(j)) && i < j) {
                j--;
            }

            if (i < j) {
                char t = word.charAt(i);
                word.setCharAt(i, word.charAt(j));
                word.setCharAt(j, t);
                i++;
                j--;
            }
        }
        return word.toString();
    }

    private static HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'));

    private static boolean isVowel(char c) {
        return vowels.contains(c);
    }
}
