 import java.util.*;
 public class slidingwindow1 {
//     public static int sliding(int[] arr, int k){
//         int n = arr.length;
//         int sum = 0,count=1;
//         for(int i=0;i<k;i++){
//            for(int j=i+1;j<k;j++){
//             if(arr[i]!=arr[j]){
//               sum += arr[i];}
        
//         else{
//             break;
//         }}
//         }
//         int max = sum;
//         int startindex = 0;
//         int endindex = k;
//         while(endindex < n && arr[startindex]!= arr[startindex+1]){
//             sum -= arr[startindex];
//              startindex++;
//              sum += arr[endindex];
//              endindex++;
     
//          max = Math.max(max,sum);}
//          return max;
//     }
    public static void main(String[] args) {
        int[] arr = {1,1,1,7,8,9};
        int k = 3;
      
        System.out.println(sliding(arr, k));
    }


  public static int sliding(int[] arr, int k){
     Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length, sum = 0, max = 0, start = 0;
        for(int i=0;i<n;i++){ 
             sum += arr[i];
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                 if((i-start+1) == k){
                    if(map.size()==k){
                        max = Math.max(max, sum);
                    }
                 sum -= arr[start];
                  if(map.get(arr[start]) <= 1)
                  map.remove(arr[start]);
                  else
                 map.put(arr[i],map.getOrDefault(arr[i],0)-1);
                 start++;
                 }
            }  
        return max;
  }
 }