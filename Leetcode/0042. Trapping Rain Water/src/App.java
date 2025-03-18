public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();

        int[] case1 = new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] case2 = new int[] {4, 2, 0, 3, 2, 5};

        System.out.println(sol.trap(case1));
        System.out.println(sol.trap2(case1));
        System.out.println(sol.trap3(case2));
    }
}
