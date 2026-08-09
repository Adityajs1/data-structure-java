class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m = g.length;
        int n = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int l = 0;
        int r = 0;

        while(r < n){
            if(g[l] <= s[r]){
                if(l == m-1){
                    return m;
                }
                l = l+1;
            }
            r = r+1;
        }
        return l;
    }
}