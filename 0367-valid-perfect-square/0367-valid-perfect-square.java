class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;
        int mid = (start + num + 1) / 2;
        while(start < mid){
            start++;
            if(start * start  == num)return true;
        }
        return false;
    }
}