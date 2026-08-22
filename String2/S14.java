//  Best Time to buy & selll stock 
// stock ki prices di hui hai , Ek din buy aur future mein ek din sell karna ha
// [7,1,5,3,6,4]
// buy : 1;
// sell 6;
//  profit 6-1=5


public class S14 {
    public int maxprofit(int[] price) {

        int minprice = price[0];
        int maxprofit = 0;

        for (int i = 1; i < price.length; i++) {
            minprice = Math.min(price[i], minprice);
            int profit = price[i] - minprice;

            maxprofit = Math.max(profit, maxprofit);

        }
        return maxprofit;
    }

    public static void main(String[] args) {
        S14 obj = new S14();
        int[] peice = { 7, 1, 5, 3, 6, 4 };
        System.out.println(obj.maxprofit(peice));
    }

}
