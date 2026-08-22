// array me do number find karo jinka sum target ke equals hona chahiye.
// nums = [2,7,11,15]
// target = 9

// 2 + 7 = 9
// Answer = [0,1]


import java.util.*;
public class S12 {
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length;i++){
            int need = target - arr[i];

            if(map.containsKey(need)){
                return new int[]{map.get(need), i};

            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {32,73,2,15,7};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    
}
