public class linkedlist5 {
   private static Node head;
   private static Node tail;
   private static int size;
   linkedlist5(){
       this.size = 0;
   }
   private static void insert(int value){
      Node node = new Node(value);
      if(tail == null){
          tail = head;
       }
      node.next = head;
      head = node;
      size++;
   }

   private static void deletefirst(){
       head = head.next;
       size--;
   }
   private static void deletelast(){
       Node temp = head;
      for(int i=1;i<size-1;i++){
           temp = temp.next;
       }
       temp.next = tail.next;
       size--;
   }

   private static void removeIndex(int index){
       Node temp = head;
       if(index <1){
           deletefirst();
           return;
       }
       if(index > size){
           System.out.print("Index is out of bound or Doesn't exist");
           return;
       }
       for(int i=1;i<index;i++){
           temp = temp.next;
       }
       temp.next = temp.next.next;
       size--;
   }

   private static void removeNode(){
       Node node = new Node(11);
       Node temp = head;
//       for(int i=1;i<){
//           temp = temp.next;
//       }
       temp.next = temp.next.next;
       size--;
   }

   public static void display(){
       Node temp = head;
       while(temp != null){
           System.out.print(temp.value+" -> ");
           temp = temp.next;
       }
       System.out.println("End");
       System.out.println("The size of LinkedList is : "+size);
   }

   private static class Node{
      private Node next;
      private int value;
      public Node(int value){
          this.value = value;
      }
      public Node(int value, Node next){
          this.value = value;
          this.next = next;
      }
   }


    public static void main(String[] args){
      linkedlist5 list = new linkedlist5();
      list.insert(5);
        list.insert(7);
        list.insert(9);
        list.insert(11);
        list.insert(17);
        list.insert(13);
        Node node = new Node(5);
        list.display();
        list.removeIndex(2);
        display();
//        list.deletelast();
//        list.display();
//        list.deletefirst();
//        list.display();
//        list.removeNode();
//        list.display();
        list.deletelast();
        list.display();
    }
}
