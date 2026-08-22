// ye check karta hai ki ek string ke ander dusari String maujood hai ya nahi.
// Ager String mil jati hai to true , nhi mili to false return karta hai.
public class contains {
    public static void main(String[] args) {
        String s1 ="I love java";

        System.out.println(s1.contains("love")); // true
        System.out.println(s1.contains("Love")); // false kyoki love != Love
        System.out.println(s1.contains("python")); // false



    }
    
}
