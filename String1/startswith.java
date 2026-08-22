//  ye method yah check karta hai ki vo suru se kisi bhi checter ya string se maich ho raha hai yaha nhi vah suru ke string ko mach  karta hai.
// ye string suru se start hoti hai to true our nhi hoti hai to false output deti hai.



public class startswith {
    public static void main(String[] args) {
        String str="Balaghat";
        String tex = "I am Rupesh";

        System.out.println(str.startsWith("Ba")); // true
        System.out.println(str.startsWith("ba")); // false
        System.out.println(str.startsWith("Balaghat")); // true
        System.out.println(str.startsWith("Balaghat123")); // false
        System.out.println(tex.startsWith("am",2)); // true // yaha index number se bhi check karta hai
        System.out.println(tex.startsWith("Rupesh",5)); // true // yaha index number se bhi check karta hai

    

    }
    
}
