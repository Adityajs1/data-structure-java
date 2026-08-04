class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // adj list bnayenge
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        for (int[] edge : prerequisites) {
            adj.get(edge[1]).add(edge[0]);
        }

        // then we create the vis array
        int[] vis = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            if(vis[i] == 0){
                if(dfs(i, vis, adj)){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean dfs(int node, int[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        for(int it : adj.get(node)){
            if(vis[it] == 0){
                if(dfs(it, vis, adj)){
                    return true;
                }
            }
            else if(vis[it] == 1){
                return true;
            }
        }

    vis[node] = 2;
    return false;  
    }
}