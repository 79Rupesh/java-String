// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal substring consisting of non-space characters only.

 

// Example 1:

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
// Example 2:

// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.

public class S9 {
    public static int LengthofLastworld(String s) {

        s = s.trim();// starting aur ending ke space ko remove karna .

        String[] world = s.split("\\s+"); // space ke basic par split

        String lastWorld = world[world.length - 1];
        return lastWorld.length();

    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(LengthofLastworld(s));
    }

}
