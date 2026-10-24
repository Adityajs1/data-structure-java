class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
       long count = 0;
        long curr = 0;
        for(int num : nums){
            if(num >= minK && num <= maxK){
                curr++;
                count += curr;
            }
            else{
                curr = 0;
            }
        }
        return count;
    }
}