// java me insert() stringBuilder aur StringBuffer class ka method hai. lska use kisi
// bhi position (index) par naya data insert karne ke liye hota hai.
public class insert{
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("jva");
        System.out.println(str.insert(1,"a"));
    }
}