import java.util.*;
public class hashset {
    public static int hash(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set.size();

    } 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,1,2,3,4,7,8};
        int res = hash(arr);
        System.out.println(res);
       
    }
}