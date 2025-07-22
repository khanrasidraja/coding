import java.util.*;
public class slidingWindow {
    public int[] max(int[] arr, int k){
        List<Integer> list = new ArrayList<>();
        int i=0, j=k-1;
        if(arr.length<k){return new int[arr.length];}
        while (j<arr.length) { 
            int max = arr[i];
            for(int x=i;x<=j;x++){
            max = Math.max(max, arr[x]);
            }
            list.add(max);
            i++;
            j++;
        }
       int[] nums = list.stream().mapToInt(Integer::intValue).toArray();
        return nums;
    }
    public static void main(String args[]){
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        slidingWindow sd = new slidingWindow();
        int[] ans = sd.max(arr,k);
        System.out.print(Arrays.toString(ans));

    }
}
