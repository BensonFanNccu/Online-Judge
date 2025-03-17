public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Implement a first in first out (FIFO) queue using only two stacks. 
         * The implemented queue should support all the functions of a 
         * normal queue (push, peek, pop, and empty).
         * 
         * Implement the MyQueue class:
         * 1. void push(int x) Pushes element x to the back of the queue.
         * 2. int pop() Removes the element from the front of the queue and returns it.
         * 3. int peek() Returns the element at the front of the queue.
         * 4. boolean empty() Returns true if the queue is empty, false otherwise.
         */
        
        MyQueue q = new MyQueue();

        q.push(1);
        q.push(2);
        q.pop();
        
        System.out.println(q.peek());
        System.out.println(q.empty());
    }
}
