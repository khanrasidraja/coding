//import java.util.*;
//public class beautySum {
//    public static void main(String args[]){
//        String a = "aabcb";
//        System.out.print(beautySum(a));
//    }
//    public static int beautySum(String s) {
//        Map<Character, Integer> frequency = new HashMap<>();
//        for(char ch : s.toCharArray()){
//            frequency.put(ch,frequency.getOrDefault(ch, 0)+1);
//        }
//        PriorityQueue<Map.Entry<Character, Integer>> minHeap = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
//        minHeap.addAll(frequency.entrySet());
////        for(Map.Entry<Character, Integer> max = minHeap ){
////
////        }
//
//    }
//}
