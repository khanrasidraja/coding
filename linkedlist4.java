import java.util.*;
public class linkedlist4{
    private ListNode head;
    private ListNode tail;
    private int size;
    public linkedlist4(){
        this.size = 0;
    }
    public void insert(int val){
        ListNode node = new ListNode(val);
        if(head == null){
            return;
        }
        node.next = head;
        head = node;
        size++;
    }
    public void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.println(temp.val+" -> ");
        }
        System.out.println("End");
    }
    private class ListNode{
        private ListNode next;
        private int val;
        public ListNode(int val){
            this.val = val;
            this.next = next;
        }
    }


    public static void main(String[] args){
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the size of Array")
//       int n = sc.nextInt();
        linkedlist4 list = new linkedlist4();
        list.insert(5);
        list.insert(5212);
        list.insert(532);
        list.insert(555);
        list.insert(77);
        list.display();
    }
}