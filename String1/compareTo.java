// ye do string ko compare ko lexicographically (direct order me)compare karta hai.
// ye matra int return karta hai .
// ager return value 0 hai to dono value same hai. our positive>0 hai to string1 dictionary order me string 2 ke bass aata hai.
// negetive<0 return value aata hai to string1 dictionary order me string2 se pehale aata ahi.

public class compareTo {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";
        String s3="Mango";
        String s4 = "Apple";
        String s5="Cat";
        String s6="Car";
        String s7="java";
        String s8="javaprogramming";

        System.out.println(s1.compareTo(s2)); // output = 0
        System.out.println(s3.compareTo(s4)); // 77-65 = 12
        System.out.println(s4.compareTo(s3)); // 65-77 = -12
        System.out.println(s5.compareTo(s6)); // 116-114= 2  pahale different character compae hota hai
        System.out.println(s7.compareTo(s8)); // 4-15= -11 ye length ko compare karega kyoki pahali string me kam string hai our dusare me jyada string hai.


    }

}
