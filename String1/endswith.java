// endswith method check karti hai ki koi string kisi particular(ending text) se samapt hoti hai ky anhi .
// ager string us suffix se samapt ho jati hai to true return karta hai ager nhi hoti hai to false return karta hai.

public class endswith {
    public static void main(String[] args) {
        String name="Rupesh";
        String city = "Balaghat";
        String s="java ";

        System.out.println(name.endsWith("esh")); // true
        System.out.println(city.endsWith("ghat")); // true
        System.out.println(city.endsWith("GHAT")); // false
        System.out.println(city.endsWith("Balaghat123")); // false
        System.out.println(city.endsWith(""));  // true  // kyoki string empty suffix("") per samapt mani jati hai. 
        System.out.println(s.endsWith("java")); // false // kyoko java ke bad bhi ek space hai.
    }
    
}
