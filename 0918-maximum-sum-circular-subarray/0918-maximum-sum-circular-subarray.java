class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int currMx = 0;
        int maxSum = nums[0];
        int currMn = 0;
        int minSum = nums[0];

        for(int i = 0; i < nums.length; i++){
            total += nums[i];

            currMx = Math.max(nums[i], currMx + nums[i]);
            maxSum = Math.max(currMx, maxSum);

            currMn = Math.min(nums[i], currMn + nums[i]);
            minSum = Math.min(currMn, minSum);
        }

        if(maxSum < 0){
            return maxSum;
        }

        return Math.max(maxSum, total-minSum);

    }
}