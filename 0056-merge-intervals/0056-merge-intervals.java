class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        int[] curr = intervals[0];
        for (int j = 1; j < intervals.length; j++){
            int[] sec = intervals[j];
            if (curr[1] >= sec[0]) {
                curr[1] = Math.max(curr[1], sec[1]);
            } 
            else {
                list.add(curr);
                curr = sec;
            }
        }
        list.add(curr);
        return list.toArray(new int[list.size()][]);
    }
}