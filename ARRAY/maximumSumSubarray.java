class Solution {
    public long maximumSumSubarray(int[] arr, int k) {
        // Code here
        int maxsum =0;
        
        for(int i=0;i<k;i++){
            maxsum+=arr[i];
        }
        
        int cursum=maxsum;
        
        for(int i=k;i<arr.length;i++){
            cursum=cursum+arr[i]-arr[i-k];
            maxsum=Math.max(cursum,maxsum);
        }
        return maxsum;
    }
}
