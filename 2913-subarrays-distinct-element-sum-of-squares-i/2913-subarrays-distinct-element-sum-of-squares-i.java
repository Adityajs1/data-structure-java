class Solution {
    public int sumCounts(List<Integer> nums) {
      int sum = 0;
      for(int i = 0; i < nums.size(); i++){
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for(int j = i; j < nums.size(); j++){
            if(!set.contains(nums.get(j))){
               set.add(nums.get(j));
               count++;
            }

            sum += count*count;
        }
      }
         return sum;
    }
}