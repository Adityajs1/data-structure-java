class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int digit = 0;
        int mul = 1;

        while (temp > 0) {
            int rem = temp % 10;
            digit += rem;
            mul *= rem;
            temp /= 10; 
        }
       int total = digit + mul;
       return n % total == 0;
    }
}