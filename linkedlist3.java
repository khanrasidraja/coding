import java.util.*;
public class linkedlist3 {

    class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
        
    }

    static Node head;
    static Node tail;
    static int size;
    public linkedlist3() {
        this.size = 0;
    }
    private Node insert(Node head, int val){
        if (head == null) {
            return new Node(val);
        }
        head.next = insert(head.next, val);
        return head;
    }
    public void display(Node head){
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print("End");
        System.out.println();
    }

    public void arraytoLinkedList(int[] arr, int n){
    //   head = null;
      for(int i=n-1;i>=0;i--){
        head = insert(head, arr[i]);
      }

    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of element in the array:");
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<n;i++){
        System.out.print("Enter no: ");
        arr[i]=sc.nextInt();
       }
         System.out.println(Arrays.toString(arr));
        //  System.out.print("Linked List: ");
         linkedlist3 ll = new linkedlist3();         
         ll.arraytoLinkedList(arr, n);
         ll.display(head);
    }
}
