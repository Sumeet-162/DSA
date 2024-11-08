class Solution {
    public int lenOfLongestSubarr(int[] arr, int k) {
        // code here
        int max=0;
        int sum=0;
        int start=0;
        
        for(int end=0;end<arr.length;end++){
            sum+=arr[end];
            
            while(sum>k && start<=end){
                sum = sum - arr[start];
                start++;
            }
            if(sum == k){
                max = Math.max(max,end-start+1);
            }
        }
        return max;
    }
}
