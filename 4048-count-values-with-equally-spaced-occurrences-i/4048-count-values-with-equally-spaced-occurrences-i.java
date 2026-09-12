class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            if(!map.containsKey(val)){
                map.put(val, new ArrayList<>());
            }
            map.get(val).add(i);
        }
        int special = 0;
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            List<Integer> ind = entry.getValue();
            if(ind.size() == 3){
                int i1 = ind.get(0);
                int i2 = ind.get(1);
                int i3 = ind.get(2);

                if(i2-i1 == i3-i2){
                special++;
            }
            }
        }
        return special;
    }
}