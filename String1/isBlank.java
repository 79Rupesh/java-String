// ye check karta hai ki String blank hai ya nahi.
// Blank ka matlab:

// Empty String ""
// Sirf spaces " "
// Tabs \t
// New line \n

// Agar String me sirf whitespace characters hain, to isBlank() true return karta hai.

public class isBlank {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = " ";

        String str3 = "      ";
        String str4 = "\n";
        String str5 = "\t";
        String str6 = "java";
        String str7 = "R";

        System.out.println(str1.isBlank());
        System.out.println(str2.isBlank());
        System.out.println(str3.isBlank());
        System.out.println(str4.isBlank());
        System.out.println(str5.isBlank());
        System.out.println(str6.isBlank());
        System.out.println(str7.isBlank());

    }

}
