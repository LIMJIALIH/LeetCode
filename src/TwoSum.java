import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] check = {3,2,4};
        int [] nums = Solution.twoSum(check,6);
        boolean isEqual = false;
        if(nums[0] == nums [1]){
            System.out.print("\nNo solution");
            isEqual = true;
        }
        for(int i = 0 ; i < nums.length && isEqual == false ; i++){
            System.out.print(nums[i]);
            if(i != nums.length - 1){
                System.out.print(",");
            }
        }
    }
}

class Solution{
    public static int[] twoSum(int [] nums, int target){
        int [] rst = new int [2];
        for(int i = 0 ; i < nums.length-1 ; i++){
            int total = 0;
            for(int j = i+1 ; j < nums.length ; j++){
                total = nums[i] + nums[j];
                if(total == target){
                    rst[0] = i;
                    rst[1] = j;
                    return rst;
                }
            }
        }
        return rst;
    }
}

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int [] res = new int [2];
        Map <Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i ++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
