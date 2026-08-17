class Solution {
    public int singleNumber(int[] nums) {
        int min=0;
        for(int i=0;i<nums.length;i++){
            min= min ^ nums[i];
        }
        return min;
    }
}