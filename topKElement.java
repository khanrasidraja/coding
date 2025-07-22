import java.util.*;
public class topKElement {
    public static void main(String args[]){
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int ans = topKelement(nums,k);
        System.out.print(ans);
    }
    public static int topKelement1(int[] nums, int k){
        PriorityQueue<Integer> max = new PriorityQueue<>();
        for(int n :  nums){
            max.add(n);
            if(max.size()>k)
                max.poll();
        }
        return max.peek();
    }

    public static int topKelement(int[] nums, int k){
        PriorityQueue<Integer> largest = new PriorityQueue<>();
        for(int num : nums){
            largest.add(num);
            if(largest.size()>k){
                largest.poll();
            }
        }
        return largest.peek();
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int num : nums){
            heap.add(num);
        }
        if(heap.size() > k){
            heap.poll();
        }
        return heap.peek();
    }
}
