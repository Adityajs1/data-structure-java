class Solution {
    public int[] maxProductPair(int[] nums, int target) {
      long max = Long.MIN_VALUE;
      int[] best = new int[]{-1, -1};

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j && nums[i] + nums[j] == target && nums[i] > nums[j]){
                    long curr = (long) nums[i]* nums[j];
                    if(curr > max){
                        max = curr;
                        best = new int[]{i, j};
                    }
                }
            }
        }
        return best;
    }
}