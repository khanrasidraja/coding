import java.util.*;
public class linkedlist4{
    public static void main(String[] args){
       linkedlist4 list = new linkedlist4();
       list.insert(7);
        list.insert(9);
        list.insert(11);
        list.insert(5);
        list.insert(3);
//        list.insertLast(21);
//        list.insertLast(31);
//        list.insertLast(41);
        list.insertMid(50, 5);
        list.insertNode(33);
        list.display();
    }
    private Node head;
    private Node tail;
    private int size;
    linkedlist4() {
        this.size = 0;
    }// insertion at first
    private void insert(int val) {
     Node node = new Node(val);
     if(tail == null){
         tail = head;
     }
     node.next = head;
     head = node;
     size++;
    }

// insertion at last
    private void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            insert(val);
            return;
        }
        tail.next = node;
        tail = node;
        node.next = null;
        size++;
    }

    //insertion using index
    private void insertMid(int val, int index){
        if(index == 0){
            insert(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val);
        temp.next = node;
        node.next = temp.next.next;
        size++;

    }

    //insertion using node
    private void insertNode(int val){
        if(head == null){
            insert(val);
            return;
        }
        Node temp = head;
        while(temp != null){
            if(temp.val == 50){
                Node node = new Node(val,temp.next);
                temp.next = node;
                size++;
            }
            temp = temp.next;
        }
    }


// for displaying the linkedlist
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
        System.out.println("The size is : "+size);
    }

    private class Node{
        private Node next;
        private int val;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}