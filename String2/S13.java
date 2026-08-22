// maximum sumarray ka sum
//  array mein continuous elemrnt ka aisa subarray find karo jiska sum mXIMUM HO.
// INPUT : [-2,1,-3,4,-1,2,1,-5,4]
// OUTPUT : 6

public class S13 {

    public int maxSubArray(int[] nums) {
        int current = nums[0];
        int maximum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            current = Math.max(nums[i], current + nums[i]);

            maximum = Math.max(maximum, current);
        }
        return maximum;

    }

    public static void main(String[] args) {
        S13 obj = new S13();
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(obj.maxSubArray(nums));
    }

}
