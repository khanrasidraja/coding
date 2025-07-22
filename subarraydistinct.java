import java.util.*;
public class subarraydistinct {
    public static void main(String[] args) {
        int[] nums = {5, 6, 8, 4, 5};
    int k = 3;
    Set<Integer> set = new HashSet<>();
       int sum = 0;
       for(int i=0;i<k;i++){
        set.add(nums[i]);
        Iterator<Integer> it = set.iterator();
            while(it.hasNext()){
            //  sum+=it.next();
            
            }
          sum+=it.next();
           System.out.print(sum);
       }
    
}
}

