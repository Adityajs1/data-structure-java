class Solution {
    public int maxValidSplits(int[] nums) {
        int n = nums.length;
        int max = split(nums, -1);
        for(int rem = 0; rem< n; rem ++){
            max = Math.max(max, split(nums, rem));
        }
        return max;
    }
    private int split(int[] nums, int rem){
        int n = nums.length;
        int m = (rem == -1)? n : n-1;
        if(m < 2)return 0;
        int[] arr = new int[m];
        for(int i = 0, j = 0; i < n; i++){
            if(i != rem)arr[j++] = nums[i];
        }

        int[] pre = new int[m];
        int[] suff = new int[m];
        pre[0] = arr[0];
        for(int i = 1; i < m; i++){
            pre[i] = gcd(pre[i-1], arr[i]);
        }
        suff[m-1] = arr[m-1];
        for(int i = m-2; i >= 0; i--){
            suff[i] = gcd(suff[i+1], arr[i]);
        }
        int splits = 0;
        for(int i = 0; i < m-1; i++){
            if(pre[i] == suff[i+1]){
                splits++;
            }
        }
        return splits;
    }
    private int gcd(int a, int b){
        return b == 0? a : gcd(b, a%b);
    }
}