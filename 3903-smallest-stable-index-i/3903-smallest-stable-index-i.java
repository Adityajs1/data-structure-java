class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int j = 0; j <= i; j++){
                max = Math.max(nums[j], max);
            }

            for(int j = i; j < nums.length; j++){
                min = Math.min(min, nums[j]);
            }

            int small = max - min;
            if(small <= k)return i;
        }
        return -1;
    }
}