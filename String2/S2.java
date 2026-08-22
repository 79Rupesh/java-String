// Given two strings s1 and s2, merge them alternatively i.e. the first character of s1 then the first character of s2 and so on till the strings end.

// Note: Add the whole string if other string is empty.

// Examples:

// Input: s1 = "Hello", s2 = "Bye"
// Output: HBeylelo
// Explanation: The characters of both the given strings are arranged alternatlively.
// Input: s1 = "abc", s2 = "def"
// Output: adbecf
// Explanation: The characters of both the given strings are arranged alternatlively.

public class S2 {

    public String mergeAlternately(String s1, String s2) {

        StringBuilder ans = new StringBuilder();

        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {
            ans.append(s1.charAt(i));
            ans.append(s2.charAt(j));
            System.out.println(j);
            i++;
            j++;
        }

        // Remaining characters of s1
        while (i < s1.length()) {
            ans.append(s1.charAt(i));
            i++;
        }

        // Remaining characters of s2
        while (j < s2.length()) {
            ans.append(s2.charAt(j));
            j++;
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        S2 obj = new S2();

        System.out.println(obj.mergeAlternately("Hello", "Bye"));
        //System.out.println(obj.mergeAlternately("abc", "def"));
    }
}
