class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> sumeet = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int compliment = target - num;
            if(sumeet.containsKey(compliment)){
                return new int[]{sumeet.get(compliment),i};
            }
            sumeet.put(num,i);
        }
        return new int[]{};
    }
}
