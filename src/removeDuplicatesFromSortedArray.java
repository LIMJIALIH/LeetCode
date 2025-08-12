/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int current = nums[0];
        int index = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] != current){
                current = nums[i];
                nums[++index] = current;
            }
        }
        return index + 1;
    }
}
// @lc code=end

