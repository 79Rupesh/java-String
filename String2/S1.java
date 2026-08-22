// Given two strings s1 and s2 in lowercase, the task is to make them anagrams. The only allowed operation is to remove a character from any string.

// Find the minimum number of characters to be deleted to make both the strings anagram.

// Two strings are called anagrams of each other if one of them can be converted into another by rearranging its letters.

// Examples:

// Input: s1 = "bcadeh", s2 = "hea"
// Output: 3
// Explanation: We need to remove b, c and d from s1. Therefore answer of this test case is 3.
// Input: s1 = "cddgk", s2 = "gcd"
// Output: 2
// Explanation: We need to remove d and k from s1. Therefore answer of this test case is 2.
// Constraints:
// 1 ≤ |s1|, |s2| ≤ 105



class S1 {
    public int minDeletions(String s1, String s2) {

        int[] freq = new int[26];

        // Count characters of s1
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        // Remove characters of s2
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }

        // Count total deletions
        int deletions = 0;
        for (int i = 0; i < 26; i++) {
            deletions += Math.abs(freq[i]);
            System.out.println(deletions);
        }

        return deletions;
    }

    public static void main(String[] args) {
        S1 obj = new S1();

        System.out.println(obj.minDeletions("bcadeh", "hea")); // 3
       // System.out.println(obj.minDeletions("cddgk", "gcd"));  // 2
    }
}