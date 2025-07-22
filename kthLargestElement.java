import java.util.*;
public class kthLargestElement {
    public static void main(String args[]) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        int n = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            maxHeap.add(nums[i]);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
//        List<Integer> list = new ArrayList<>(set);
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i));}
        int peak = maxHeap.peek();
        System.out.print(peak);
    }
}
