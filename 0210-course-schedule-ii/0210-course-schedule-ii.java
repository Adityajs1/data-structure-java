class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            adj.get(edge[1]).add(edge[0]);
        }
        int[] vis = new int[numCourses];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < numCourses; i++) {
            if (vis[i] == 0) {
                if (dfs(i, adj, vis, st))
                    return new int[0];
            }
        }
        int[] ans = new int[numCourses];
        int idx = 0;
        while (!st.isEmpty()) {
            ans[idx++] = st.pop();
        }
        return ans;
    }

    private boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, Stack<Integer> st) {
        vis[node] = 1;
        for (int nei : adj.get(node)) {
            if (vis[nei] == 0) {
                if (dfs(nei, adj, vis, st))
                    return true;
            }

            else if (vis[nei] == 1) {
                return true;
            }
        }

        vis[node] = 2;
        st.push(node);

        return false;
    }
}