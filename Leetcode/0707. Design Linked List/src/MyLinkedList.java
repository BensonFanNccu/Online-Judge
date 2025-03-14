public class MyLinkedList {
    int size;
    ListNode head;


    public MyLinkedList(){
        this.size = 0;
        this.head = new ListNode(0);
    }

    
    public int get(int index){
        if(index < 0 || index >= size) return -1;

        ListNode cur = head;

        for(int i = 0; i <= index; i++) cur = cur.next;

        return cur.val;
    }

    
    public void addAtHead(int val){
        ListNode node = new ListNode(val);

        node.next = head.next;
        head.next = node;
        size++;
    }

    
    public void addAtTail(int val){
        ListNode node = new ListNode(val);
        ListNode cur = head;

        while(cur.next != null) cur = cur.next;

        cur.next = node;
        size++;

    }

    
    public void addAtIndex(int index, int val){
        if(index < 0 || index > size) return;

        ListNode node = new ListNode(val);
        ListNode cur = head;

        for(int i = 0; i < index; i++) cur = cur.next;

        node.next = cur.next;
        cur.next = node;
        size++;
    }
    
    
    public void deleteAtIndex(int index){
        if(index < 0 || index >= size) return;

        ListNode cur = head;

        for(int i = 0; i < index; i++) cur = cur.next;

        cur.next = cur.next.next;
        size--;
    }
}
