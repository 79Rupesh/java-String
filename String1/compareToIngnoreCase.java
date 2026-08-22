//  ye method do string ko compare karta hai bina uparcase aur lowercase ka difference dekhe.
// ye method int return karti hai.
// 0 = dono string same hain (case ingone karke)
// nagetive = string1 lexicographically chhoti hoti hai .
// positive = string lexicographically badi hai.

public class compareToIngnoreCase {
    public static void main(String[] args) {
        String s1="java";
        String s2="Java";
        String s3 ="Apple";
        String s4="Banana";

        System.out.println(s1.compareToIgnoreCase(s2)); // Java aur java me sirtf case ka difference hai isliye case ignore kiya jata hai isliye output 0 aaya hai.
        System.out.println(s3.compareToIgnoreCase(s4)); // Apple aur Banana compare hinga aur alphabetically B  se pehle aata hai isliye nagetive value return karta hai.
        
    }
    
}