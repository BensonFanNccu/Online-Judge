import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Straight Forward Solution
         * Time: O(1)
         * Space: O(1)
         */
        
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int a = sc.nextInt(), b = sc.nextInt();

            System.out.print(a + b);
        }

        sc.close();
    }
}
