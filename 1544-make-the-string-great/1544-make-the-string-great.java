class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && Math.abs(c-st.peek()) == 32){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        String ans = "";
         while(!st.empty()){
            ans += st.peek();
            st.pop();
        }
        ans = reverse(ans);
        return ans;
    }
   private String reverse(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);
   }
}