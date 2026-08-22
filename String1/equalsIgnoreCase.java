// ye dono String ko compare karta hai aur uppercase / lowercase ko ignore karta hai
// ager dono string same hain(case ignore karne ke bad),to true return karta ahi, nhi to false return karta hai
public class equalsIgnoreCase {
    public static void main(String[] args) {
        String S1="Java";
        String S2="java";
        String S3="Rupesh";
        String s4="Rajesh";
        System.out.println(S1.equalsIgnoreCase(S2));
        System.out.println(S3.equalsIgnoreCase(s4));
    }
    
}
