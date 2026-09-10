class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       List<Integer> ans = new ArrayList<>();
       int i = num.length-1;
       int carry = 0;

       while(i >= 0 || k > 0 || carry > 0){
        int digit = k % 10;
         k = k / 10;
         int sum = digit + carry;

         if(i >= 0){
            sum += num[i];
            i--;
         }
         ans.add(sum % 10);
         carry = sum / 10;
       }
       Collections.reverse(ans);
       return ans;
    }
}