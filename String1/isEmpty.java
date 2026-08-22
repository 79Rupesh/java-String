//  isEmpty() java ka String method hai. jo check karta hai ki String empty hai ya nhi.
// Empty ka matalb string ki length = 0 honi chahiye.
// ager ek bhi character (space bhi) hai. to string empty nhi hoti.

public class isEmpty {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "java";
        String str3 = " ";
        String str4 = "progrming";

        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());
        System.out.println(str3.isEmpty());
        System.out.println(str4.isEmpty());

    }

}
