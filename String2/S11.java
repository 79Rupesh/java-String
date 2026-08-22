// String Duplicates Removal
// Difficulty: EasyAccuracy: 58.68%Submissions: 252K+Points: 2Average Time: 15m
// Given a string s which may contain lowercase and uppercase characters. The task is to remove all duplicate characters from the string and find the resultant string. The order of remaining characters in the output should be same as in the original string.

// Examples:

// Input: s = "geEksforGEeks"
// Output: "geEksforG"
// Explanation: After removing duplicate characters such as E, e, k, s, we have string as "geEksforG".
// Input: s = "HaPpyNewYear"
// Output: "HaPpyNewYr"
// Explanation: After removing duplicate characters such as e, a, we have string as "HaPpyNewYr".

public class S11 {
    public static void main(String[] args) {
        String s = "geEksforGEeks";
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ans.indexOf(String.valueOf(ch)) == -1) {
                ans.append(ch);
            }
        }
        System.out.print(ans);

    }

}
