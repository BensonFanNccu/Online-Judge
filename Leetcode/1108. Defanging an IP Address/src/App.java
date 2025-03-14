public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a valid (IPv4) IP address, return a defanged version of that IP address.
         * A defanged IP address replaces every period "." with "[.]".
         * 
         * Example:
         * Input: address = "1.1.1.1"
         * Output: "1[.]1[.]1[.]1"
         */

        Solution sol = new Solution();

        System.out.println(sol.defangIPaddr("1.1.1.1"));
        System.out.println(sol.defangIPaddr("255.100.50.0"));
    }
}
