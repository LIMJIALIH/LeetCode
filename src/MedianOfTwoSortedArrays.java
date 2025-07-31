/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] nums3 = new int [nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                nums3[k++] = nums1[i++];
            }else{
                nums3[k++] = nums2[j++];
            }
        }

        while(i < nums1.length){
            nums3[k++] = nums1[i++];
        }

        while(j < nums2.length){
            nums3[k++] = nums2[j++];
        }

        if(nums3.length % 2 == 0){
            int mid = nums3[nums3.length / 2];
            int mid2 = nums3[nums3.length / 2 - 1];
            return (mid + mid2) / 2.0;
        }else{
            return nums3[nums3.length / 2];
        }
    }
}
// @lc code=end

