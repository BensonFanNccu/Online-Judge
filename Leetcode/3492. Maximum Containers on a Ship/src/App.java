public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You are given a positive integer n representing an n x n cargo deck on a ship. 
         * Each cell on the deck can hold one container with a weight of exactly w.
         * 
         * However, the total weight of all containers, if loaded onto the deck, 
         * must not exceed the ship's maximum weight capacity, maxWeight.
         * 
         * Return the maximum number of containers that can be loaded onto the ship.
         */
        
        Solution sol = new Solution();

        System.out.println(sol.maxContainers(2, 4, 15));
        System.out.println(sol.maxContainers(3, 5, 20));
    }
}
