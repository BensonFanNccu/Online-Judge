import java.util.Arrays;


public class UnionFind {
    int[] parent;
    int[] size;


    public UnionFind(int n){
        parent = new int[n];
        size = new int[n];
        Arrays.fill(parent, -1);
        Arrays.fill(size, 1);
    }


    public int find(int node){
        if(parent[node] == -1) return node;
        
        return parent[node] = find(parent[node]);
    }


    public void union(int node1, int node2){
        int root1 = find(node1);
        int root2 = find(node2);

        if (root1 == root2) return;
        if (size[root1] > size[root2]){
            parent[root2] = root1;
            size[root1] += size[root2];
        }else{
            parent[root1] = root2;
            size[root2] += size[root1];
        }
    }
}
