class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        while(i < n){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= n && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        for(int in = 0; in < n; in++){
            if(nums[in] != in + 1){
                return in+1;
            }
        }
        return n+1;
    }
    private void swap(int[] nums, int i , int correct){
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}