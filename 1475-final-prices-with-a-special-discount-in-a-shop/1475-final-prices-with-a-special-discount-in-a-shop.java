class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = prices.clone();
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {
          while (!st.isEmpty() && st.peek() > prices[i]){
             st.pop();
          }
          if (!st.isEmpty()) ans[i] -= st.peek();
          st.push(prices[i]);
        }
        return ans;
    }
}