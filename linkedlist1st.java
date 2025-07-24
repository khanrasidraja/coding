public class linkedlist1st {
    private Node head;
    private Node tail;
    private int size;
    public linkedlist1st(){
        this.size = 0;}

    private void insert(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size+=1;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("End");
        System.out.println(size);
    }

    private class Node{
        private Node next;
        private int val;

        private Node(int val){
            this.val = val;
        }
        private Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args){
        linkedlist1st list = new linkedlist1st();
        list.insert(3);
        list.display();
    }
}
