public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You are in a city that consists of n intersections numbered from 0 to n - 1 
         * with bi-directional roads between some intersections. 
         * The inputs are generated such that you can reach any intersection from 
         * any other intersection and that there is at most one road between any two intersections.
         * 
         * You are given an integer n and a 2D integer array roads where roads[i] = [ui, vi, timei] 
         * means that there is a road between intersections ui and vi 
         * that takes timei minutes to travel. 
         * You want to know in how many ways you can travel from intersection 0 to 
         * intersection n - 1 in the shortest amount of time.
         * 
         * Return the number of ways you can arrive at your destination in the shortest amount of time. 
         * Since the answer may be large, return it modulo 10^9 + 7.
         * 
         * Example:
         * Input: n = 7, roads = [[0,6,7],[0,1,2],[1,2,3],[1,3,3],[6,3,3],[3,5,1],[6,5,1],[2,5,1],[0,4,5],[4,6,2]]
         * Output: 4
         */
        
        Solution sol = new Solution();

        int[][] case1 = new int[][] {{0, 6, 7}, {0, 1, 2}, {1, 2, 3}, {1, 3, 3}, {6, 3, 3}, {3, 5, 1}, {6, 5, 1}, {2, 5, 1}, {0, 4, 5}, {4, 6, 2}};

        System.out.println(sol.countPaths(7, case1));
    }
}
