// Longest Common Prefix of Strings
// Given an array of strings arr[]. Return the longest common prefix among each and every strings present in the array. If there's no prefix common in all the strings, return "".

// Examples :

// Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
// Output: "gee"
// Explanation: "gee" is the longest common prefix in all the given strings.
// Input: arr[] = ["hello", "world"]
// Output: ""
// Explanation: There's no common prefix in the given strings.

public class S8 {

    public static String longestCommonString(String[] arr) {
        if (arr == null || arr.length == 0)
            return "";

        String frist = arr[0];

        for (int i = 0; i < frist.length(); i++) {
            for (int j = 1; j < arr.length; j++) {
                char ch = frist.charAt(i);

                if (i > arr[j].length() || arr[j].charAt(i) != ch) {
                    return frist.substring(0, i);

                }

            }
        }
        return frist;
    }

    public static void main(String[] args) {
        String[] arr = {
                "geeksforgeeks",
                "geeks",
                "geek",
                "geezer"
        };
        System.out.println(longestCommonString(arr));

    }

}





    public static String longestCommonPrefix(String[] arr) {

        if (arr == null || arr.length == 0)
            return "";

        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {

            while (!arr[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        String[] arr = {
            "geeksforgeeks",
            "geeks",
            "geek",
            "geezer"
        };

        System.out.println(longestCommonPrefix(arr));
    }
