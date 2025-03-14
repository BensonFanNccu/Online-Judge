public class ListNode {
    int val;
    ListNode next;


    public ListNode(){
        this.next = null;
    }


    public ListNode(int val){
        this.val = val;
        this.next = null;
    }


    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }


    public ListNode(int[] nums){
        val = nums[0];

        if(nums.length == 1){
            next = null;
        }else{
            for(int i = 1; i < nums.length; i++) this.add(nums[i]);
        }
    }


    public void add(int item){
        ListNode node = new ListNode(item);
        
        if(next == null) next = node;
        else next.add(item);
    }


    public void printNodes(){
        System.out.print(val + " ");
        
        if(next != null) next.printNodes();
    }


    public void addCycle(){
        ListNode cur = this;

        while(cur.next != null) cur = cur.next;

        cur.next = this;
    }
}

