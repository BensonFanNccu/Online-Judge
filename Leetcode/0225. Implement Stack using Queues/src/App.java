public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Implement a last-in-first-out (LIFO) stack using only two queues. 
         * The implemented stack should support all the functions of a 
         * normal stack (push, top, pop, and empty).
         * 
         * Implement the MyStack class:
         * 1. void push(int x) Pushes element x to the top of the stack.
         * 2. int pop() Removes the element on the top of the stack and returns it.
         * 3. int top() Returns the element on the top of the stack.
         * 4. boolean empty() Returns true if the stack is empty, false otherwise.
         */

        MyStack s = new MyStack();

        s.push(1);
        s.push(2);
        s.pop();

        System.out.println(s.top());
        System.out.println(s.empty());
    }
}
