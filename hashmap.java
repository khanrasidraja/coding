import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class hashmap {
 public static void main(String args[]){
     int[] nums = {1,1,1,2,2,3};
     int k = 2;
     Map<Integer, Integer> frequency = new HashMap<>();
     for(int num : nums){
         frequency.put(num, frequency.getOrDefault(num, 0)+1);
     }
     PriorityQueue<Map.Entry<Integer, Integer>> max = new PriorityQueue<>((a, b)->a.getValue()-b.getValue());
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

 }   
}
