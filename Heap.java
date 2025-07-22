import java.util.*;
public class Heap {
    public static void main(String args[]){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int[] arr = {8,9,5,6,4,6,7,8};
        for(int ar : arr){
            minHeap.add(ar);
        }
        System.out.println(minHeap);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        maxHeap.addAll(minHeap);
        System.out.println(maxHeap);
    }
}

