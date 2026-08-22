// Given a string s in Roman number format, your task is to convert it to an integer. Various symbols and their values are given below.
// Note: I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000

// Examples:

// Input: s = "IX"
// Output: 9
// Explanation: IX is a Roman symbol which represents 10 – 1 = 9.
// Input: s = "XL"
// Output: 40
// Explanation: XL is a Roman symbol which represents 50 – 10 = 40.
// Input: s = "MCMIV"
// Output: 1904
// Explanation: M is 1000, CM is 1000 – 100 = 900, and IV is 4. So we have total as 1000 + 900 + 4 = 1904.

public class S7 {

    public String longestCommonPrefix(String[] arr) {

        if (arr == null || arr.length == 0)
            return "";

        String first = arr[0];

        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            for (int j = 1; j < arr.length; j++) {

                if (i >= arr[j].length() || arr[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }
}


