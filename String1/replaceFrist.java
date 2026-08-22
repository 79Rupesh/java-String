//  iska kam string me jo sirf pahli bar match ho jata hai use hi replace karta hai.
// ager string me vahi value hai bar baar ho , to sirf pehli occurrence replace hogi, baaki waise hi rahegi. 
// java me string immutable hoti hai isliye original string kbhi change nahi hoti . replaceFrist() ek nayi string retun karta hai 

public class replaceFrist {
    public static void main(String[] args) {
        String str1 = "java java java";
        String Str2 = "banana";
        // String result = Str2.replaceFirst("a", "o");

        System.out.println(str1.replaceFirst("java", "python"));
        System.out.println("aaa".replaceFirst("a", "b"));
        System.out.println("java java python java".replaceFirst("java", "C++"));
        System.out.println(Str2.replaceFirst("a", "o"));
    }

}
