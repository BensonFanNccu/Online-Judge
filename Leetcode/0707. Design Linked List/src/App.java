public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Design your implementation of the linked list. 
         * You can choose to use a singly or doubly linked list.
         * A node in a singly linked list should have two attributes: val and next. 
         * val is the value of the current node, and next is a pointer/reference to 
         * the next node.
         * 
         * If you want to use the doubly linked list, you will need one more attribute prev 
         * to indicate the previous node in the linked list. 
         * Assume all nodes in the linked list are 0-indexed.
         * 
         * Implement the MyLinkedList class:
         * 1. MyLinkedList() Initializes the MyLinkedList object.
         * 2. int get(int index) Get the value of the indexth node in the linked list. 
         *    If the index is invalid, return -1.
         * 3. void addAtHead(int val) Add a node of value val before the first element of 
         *    the linked list. After the insertion, the new node will be the first node of the linked list.
         * 4. void addAtTail(int val) Append a node of value val as the last element of 
         *    the linked list.
         * 5. void addAtIndex(int index, int val) Add a node of value val before the 
         *    indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
         * 6. void deleteAtIndex(int index) Delete the indexth node in the linked list, 
         *    if the index is valid.
         */
        
        MyLinkedList mylist = new MyLinkedList();

        mylist.addAtHead(1);
        mylist.addAtTail(3);
        mylist.addAtIndex(1, 2);
        mylist.deleteAtIndex(1);

        mylist.head.printNodes();
    }
}
