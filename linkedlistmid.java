public class linkedlistmid {
    public ListNode head;
    public ListNode tail;
    public int size;
    linkedlistmid(){
        this.size = 0;
    }
     public class ListNode {
         int val;
         ListNode next;

         ListNode() {
         }

         ListNode(int val) {
             this.val = val;
         }

         ListNode(int val, ListNode next) {
             this.val = val;
             this.next = next;
         }
     }
     public void insertNode(int val){
         ListNode node = new ListNode(val);
         if(tail == null){
             tail = head;
         }
         node.next = head;
         head = node;
         size++;
     }

     public void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("End");
     }
        public void middleNode() {
            ListNode fast = head, slow = head;
            while(fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                    System.out.print(slow + " -> ");
            }
            System.out.println("End");
        }

        public ListNode middle(){
            if(head == null){
                return null;
            }
            ListNode fast = head, slow = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

    public ListNode middleRemove(){
//        if(head == null){
//            return null;
//        }
        int s = 0;
        ListNode fast = head, slow = head, prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        ListNode temp = head;
         while(temp!=null){
             System.out.print(temp.val+" -> ");
              temp = temp.next;
          }

        return head;
    }

    public static void main(String[] args){
     linkedlistmid list= new linkedlistmid();
//        1,3,4,7,1,2,6
        list.insertNode(6);
        list.insertNode(2);
     list.insertNode(1);
        list.insertNode(7);
        list.insertNode(4);
        list.insertNode(3);
        list.insertNode(1);
        list.display();
//        System.out.print(list.middle().val);
       System.out.print(list.middleRemove());
    }
}
