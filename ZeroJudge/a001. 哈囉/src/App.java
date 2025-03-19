import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Straight Forward Solution
         * Time: O(1)
         * Space: O(1)
         */
        
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) System.out.printf("hello, %s", sc.nextLine());

        sc.close();
    }
}
