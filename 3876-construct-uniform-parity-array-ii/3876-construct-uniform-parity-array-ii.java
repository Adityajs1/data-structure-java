class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd = Integer.MAX_VALUE;
        for (int n : nums1) {
            if (n % 2 != 0) {
                odd = Math.min(odd, n);
            }
        }
        for (int n : nums1) {
            if (n % 2 == 0 &&  odd != Integer.MAX_VALUE && n < odd) {
                return false;
            }
        }
        return true;

    }
}