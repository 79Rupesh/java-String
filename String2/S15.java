// Ek integer array nums diya gaya hai. Tumhe ek naya array return karna hai jisme har index i par baaki sabhi elements ka product ho, lekin nums[i] ko multiply nahi karna hai.

// Condition: Division (/) operator ka use nahi karna hai.

import java.util.Arrays;

public class S15 {

    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        int right = 1;

        for (int i = n - 1; i >= 0; i--) {

            answer[i] = answer[i] * right;

            right = right * nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        S15 obj = new S15();

        int[] nums = { 1, 2, 3, 4 };

        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));

    }
}
