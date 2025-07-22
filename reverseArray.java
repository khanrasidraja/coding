import java.util.*;
public class reverseArray {
    public static void main(String args[]){
        List<String> stringList = new ArrayList<>();
        List<String> queries = new ArrayList<>();


    }
        public int[] reverse(int arr[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[n-i-1]);

    }
        return new int[]{};
    }
    public static List<Integer> matchingStrings1(List<String> stringList, List<String> queries) {
        List<Integer> match = new ArrayList<>();
       for(String s : queries){
           int count = 0;
           for(String a : stringList){
               if(a.equals(s)){
                   count++;
               }
           }
           match.add(count);
       }
        return match;

    }
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        Map<String, Integer> frequency = new HashMap<>();
        for(String s: stringList){
            frequency.put(s, frequency.getOrDefault(s, 0)+1);
        }
        ArrayList<Integer> match = new ArrayList<>();
        for(String s : queries) {
            match.add(frequency.getOrDefault(s, 0));
        }return match;
    }
}
