import java.util.*;
class topKFrequent1 {
 public static void main(String args[]){
     int[] nums = {1,1,1,2,2,3,3};
     int k = 2;
     int[] ans = topKFrequent(nums,k);
     for(int i=0;i<ans.length;i++) {
         System.out.print(ans[i]);
     }

 }
    public static int[] topKFrequent1(int[] nums, int k) {
        Map<Integer, Integer> frequencymap = new HashMap<>();

        for(int num : nums){
            frequencymap.put(num, frequencymap.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>();
        for(Map.Entry<Integer, Integer> entry : frequencymap.entrySet()){
            minHeap.add(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[] res = new int[k];
        int index = 0;
        for(Map.Entry<Integer, Integer> entry : minHeap){
            res[index++] = entry.getKey();
        }
        return res;

    }
    public static int[] topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for(int num : nums){
            frequency.put(num, frequency.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> top = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
            for(Map.Entry<Integer, Integer> minHeap : frequency.entrySet()){
             top.add(minHeap);
             if(top.size() > k)
                 top.poll();
            }
             int[] frequent = new int[k];
             int index = 0;
             for(Map.Entry<Integer, Integer> min : top){
                 frequent[index++] = min.getKey();
             }
             return frequent;
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for(int num : nums){
            frequency.put(num, frequency.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> max = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer, Integer> map : frequency.entrySet()){
            max.add(map);
        if(max.size()>k)
            max.poll();

        }
        int[] ans = new int[k];
        int index = 0;
        for(Map.Entry<Integer, Integer> map : max){
             ans[index++] = map.getKey();
        }
        for(Map.Entry<Integer, Integer> map: frequency.entrySet()){
            System.out.print(map);
        }
        return ans;
    }
}
