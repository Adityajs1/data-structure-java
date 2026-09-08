class Solution {
    public int countCommas(int n) {
        int count = 0;
        if(n >= 1000 && n <= 999999){
            count = 1 + (n-1000);
        }
        else if(n == 1000000){
            count = 2;
        }
        else if(n < 1000){
            return 0;
        }
        return count;
    }
}