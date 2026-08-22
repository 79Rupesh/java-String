// java me string class ka ek method hai jo string ke sirf starting (left) aur ending (right)
//  ke spaces ko remove karta hai. beech(middle) ke spaces ko kabhi removw nhi karta hai/
// trim() origina; string ko change nhi karta , kyoki java me string immutable hota hai.

public class trim {
    public static void main(String[] args) {
        String str1 = "  Hello World  ";
        String str2 = "Hello   ";
        String str3 = "   Hello";
        String str4 = "hello        world";

        System.out.println(str1.trim());
        System.out.println(str2.trim());
        System.out.println(str3.trim());
        System.out.println(str4.trim());

    }
}
