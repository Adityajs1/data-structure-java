class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int len = 1; len <= n / 2; len++) {
            if (n % len != 0) continue;
            // to check krte hai agr pattern repeat hoga
             boolean repeat = true;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != s.charAt(i % len)) {
                    repeat = false;
                    break;
                }
            }

            if (repeat) return true;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != s.charAt(i % len)) {
                    repeat = false;
                    break;
                }
            }

            if (repeat) return true;

        }

        return false;
    }
}