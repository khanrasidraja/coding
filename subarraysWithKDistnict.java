
import java.util.Map;
import java.util.HashMap;
public class subarraysWithKDistnict {
    public static void main(String args[]){
        int[] nums = {1,2,1,3,4};
        int k =  2;
        System.out.print(subArray(nums,k));
    }
//    public static int subarraysWithKDistinct(int[] nums, int k) {
//        return slidingWindow(nums,k)-slidingWindow(nums,k-1);
//    }
//    private static int slidingWindow(int[] nums, int k){
//        int left = 0,count = 0;
//        Map<Integer, Integer> frequency = new HashMap<>();
//        for (int right = 0; right < nums.length;) {
//            frequency.put(nums[right], frequency.getOrDefault(nums[right], 0) + 1);
//            while(frequency.size()>k) {
//                frequency.put(nums[left], frequency.get(nums[left]) - 1);
//                if (frequency.get(nums[left]) == 0) {
//                    frequency.remove(nums[left]);
//                }left++;
//            }
//            count += right-left+1;
//            right++;
//            }
//        return count;
//
//    }

    public static int subArray(int[] nums,int k){
        int count = 0,j=0;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length;){
            freq.put(nums[i],freq.getOrDefault(nums[i], 0)+1);
                while(freq.size()>k) {
                    freq.put(nums[j], freq.getOrDefault(nums[j], 0) - 1);
                    if (freq.get(nums[j]) == 0) {
                        freq.remove(nums[j]);j++;
                    }
                    count += i-j+1;
                    i++;
                }
            }
        return count;
    }
}
