public class Solution {
    int[] parent;
    int[] depth;


    public int[] minimumCost(int n, int[][] edges, int[][] queries){
        /*
         * Disjoint Set Solution
         * Time: O(M+queries.length)
         * Space: O(N)
         */
        
        int[] componentCost = new int[n];
        int[] ans = new int[queries.length];

        parent = new int[n];
        depth = new int[n];

        for (int i = 0; i < n; i++) parent[i] = -1;
        for (int i = 0; i < n; i++) componentCost[i] = Integer.MAX_VALUE;
        for (int[] edge : edges) union(edge[0], edge[1]);

        for (int[] edge : edges) {
            int root = find(edge[0]);

            componentCost[root] &= edge[2];
        }

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            if (find(start) != find(end)) ans[i] = -1;
            else {
                int root = find(start);

                ans[i] = componentCost[root];
            }
        }

        return ans;
    }


    public int find(int node){
        if (parent[node] == -1) return node;

        return parent[node] = find(parent[node]);
    }


    public void union(int node1, int node2){
        int root1 = find(node1);
        int root2 = find(node2);

        if (root1 == root2) return;
        if (depth[root1] < depth[root2]) {
            int temp = root1;

            root1 = root2;
            root2 = temp;
        }

        parent[root2] = root1;

        if (depth[root1] == depth[root2]) depth[root1]++;
    }
}
