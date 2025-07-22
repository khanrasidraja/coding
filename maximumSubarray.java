import java.util.*;

public class maximumSubarray {
    public static void main(String args[]){
        int[] nums = {1,2,1,3,4};
        int count = 0;
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
for(int i=0;i<n;i++){for(int j=i;j<n;j++){for(int k = i;k<=j;k++) {

    pq.add(nums[k]);
//    if (pq.size() > k) {
//        pq.poll();
//    }
}
}System.out.println(pq);
}
        System.out.println(n*(n+1)/2);
        System.out.print(pq.size());
    }

}
