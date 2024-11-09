class Solution {
    public int longestOnes(int[] nums, int k) {
        int l =0,r =0, maxLen =0, zero=0;

        while(r<nums.length){
            if(nums[r]==0) zero++;

            while(zero>k){
                if(nums[l]==0) zero--;
                l++;
            }
            maxLen = Math.max(maxLen,r-l+1);
        
            r++;
        }
        return maxLen;
    }
}


/*

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

*/
