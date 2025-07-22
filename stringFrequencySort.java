import java.util.*;
public class stringFrequencySort {
    public static void main(String args[]){
        String s = "Aabb";
        System.out.print(frequencySort(s));
    }
        public static String frequencySort(String s) {
            Map<Character, Integer> frequency = new HashMap<>();
            for(int i=0;i<s.length();i++){
                frequency.put(s.charAt(i), frequency.getOrDefault(s.charAt(i),0)+1);
            }
            PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
            maxHeap.addAll(frequency.entrySet());
            StringBuilder ans = new StringBuilder();
            while(!maxHeap.isEmpty()) {
                Map.Entry<Character, Integer> max = maxHeap.poll();
                    char ch = max.getKey();
                    int n = max.getValue();
                    for(int i=0;i<n;i++){
                        ans.append(ch);
                    }
                }
                      return ans.toString();
        }
}
