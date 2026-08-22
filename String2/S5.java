public class S5 {
        
    boolean isPalindrome(String s) {

        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        return s.equals(rev);
    }

public static void main(String[] args) {
    S5 obj=new S5();
    System.out.println(obj.isPalindrome("abc"));
}

}