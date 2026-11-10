class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] minCost = new int[n + 1];
        Arrays.fill(minCost, Integer.MAX_VALUE);
        Queue<Integer> queue = new LinkedList<>();
        minCost[0] = 0;
        queue.offer(0);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            
            for (int v = u + 1; v <= Math.min(n, u + 3); v++) {
                int weight = costs[v - 1] + (v - u) * (v - u);
                if (minCost[u] + weight < minCost[v]) {
                    minCost[v] = minCost[u] + weight;
                    queue.offer(v);
                }
            }
        }
        return minCost[n];
    }
}