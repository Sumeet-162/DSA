class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> sumeet = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(sumeet.contains(num))
                return true;
            sumeet.add(num);
        }
        return false;
    }
}
