import java.util.*;
public class mintomaxHeap {
    public static void main(String args[]){
        int N = 4;
        int[] arr = {1, 2, 3, 4};

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int ar : arr) {
            minHeap.add(ar);
}
//        System.out.println(minHeap);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) maxHeap.add(num);
        System.out.println(maxHeap);

}
}