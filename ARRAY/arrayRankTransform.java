class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        
        Map<Integer,Integer> sumeet = new HashMap<>();
        int rank = 1;

        for(int num : sorted){
            if(!sumeet.containsKey(num)){
                sumeet.put(num,rank);
                rank++;
            }
        }
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i] = sumeet.get(arr[i]);
        }

        return result;
    }
}



/*
Example 1:

Input: arr = [40,10,20,30]
Output: [4,1,2,3]
Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.

Example 2:

Input: arr = [100,100,100]
Output: [1,1,1]
Explanation: Same elements share the same rank.

Example 3:

Input: arr = [37,12,28,9,100,56,80,5,12]
Output: [5,3,4,2,8,6,7,1,3]
*/