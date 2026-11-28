class Solution {
    public int reverse(int x) {
        int n = 0;

        while (x != 0) {
            int digit = x % 10;
            if (n > Integer.MAX_VALUE / 10 ||
                n < Integer.MIN_VALUE / 10) {
                return 0;
            }

            n = n * 10 + digit;
            x = x / 10;
        }
        return n;
    }
}