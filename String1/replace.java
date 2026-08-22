// isme ham ek string methode hai jo kisi character ya substring ko kisi dusare character ya substring se repplace (badal) deta hai.
//  java me string immutable hoti hai . isliye replace() original string ko chanhe nahi karta . ye ek nayi string retunr karta hai.
public class replace{
    public static void main(String[] args) {
        String name="Rupesh";
        String str="i like java";


        System.out.println(name.replace('u','#'));
        System.out.println(str.replace("java","python"));
        System.out.println(name);
    }
}

