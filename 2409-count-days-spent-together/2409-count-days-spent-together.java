class Solution {
    public int countDaysTogether(String aA, String lA, String aB, String lB) {
        int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int startA = getDay(aA, m);
        int endA = getDay(lA, m);
        int startB = getDay(aB, m);
        int endB = getDay(lB, m);
        
        int start = Math.max(startA, startB);
        int end = Math.min(endA, endB);
        
        return Math.max(0, end - start + 1);
    }
    
    private int getDay(String d, int[] m) {
        int mon = Integer.parseInt(d.substring(0, 2));
        int day = Integer.parseInt(d.substring(3, 5));
        
        for (int i = 0; i < mon - 1; i++) {
            day += m[i];
        }
        return day;
    }
}