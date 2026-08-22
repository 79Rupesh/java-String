//  replaceAll() Java ka String method hai jo Regular Expression (Regex) ki help se String ke sabhi matching parts ko replace karta hai.

// Note: replace() aur replaceAll() alag hote hain.

// replace() → Normal text replace karta hai.
// replaceAll() → Regex ke basis par replace karta hai.

public class replaceAll {
    public static void main(String[] args) {
        String str = "Java123 Programming456";

        System.out.println(str.replaceAll("\\d",""));
        System.out.println(str.replaceAll("\\d","X"));
        System.out.println("banana".replaceAll("a","o"));
        System.out.println("Java Programming".replaceAll("\\s","-"));
        System.out.println("abc123xyz".replaceAll("[a-z]","*"));
        System.out.println(str);
    }
    
}
