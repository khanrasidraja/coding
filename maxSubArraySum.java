import java.util.*;
public class maxSubArraySum {
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5,6};
        int k = 1;
        long ans = maximumSubarraySum4(nums,k);
        System.out.print(ans);
    }
    public long maximumSubarraySum1(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int left = 0, right = 0;
        while (right < nums.length) {
            if ((right - left + 1) == k) {
                if (!set.contains(nums[right])) {
                    set.add(nums[right++]);
                } else {
                    set.remove(nums[left++]);
                }
            }

        }
        long sum = 0;
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            sum += it.next();
        }
        return sum;

    }

    public static long maximumSubarraySum2(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        Iterator<Integer> it = set.iterator();
        long sum = 0, maxsum = 0;
        for(int i=0;i<k;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                sum += nums[i];
            }
        }
        maxsum = sum;
        for(int i = k;i<nums.length;i++){
            if((i-k+1)==k){
            if(!set.contains(nums[i])){
                sum += nums[i] - nums[i-k+1];
                set.add(nums[i-k+1]);
            }
            else{
                set.remove(nums[i]);
            }
            maxsum = Math.max(maxsum,sum);
        }}
        long max = 0;
        while(it.hasNext()){
            max += it.next();
        }
        return maxsum;
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        int left = 0,sum = 0;
        for(int i=0;i<nums.length;i++){
            while((i-left+1) <= k){
                frequency.put(nums[i],frequency.getOrDefault(nums[i],0)+1);
                if(frequency.size()==k){
                    sum += frequency.get(nums[i]);
                }
                else{
                    frequency.remove(frequency.getOrDefault(nums[left],0)-1);
                    left++;}
                frequency.put(nums[i],frequency.getOrDefault(nums[i],0)+1);

            }
        }
        return sum;
    }

    public static long maximumSubarraySum3(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long sum =0, maxsum =0;
        int left = 0;
        for(int right = 0;right<nums.length;right++){
            if(set.contains(nums[right])){
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            sum+=nums[right];

            if((right-left+1)==k){
                maxsum = Math.max(maxsum,sum);
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
        }
        return maxsum;

    }
    public static long maximumSubarraySum4(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=1;i<nums.length;i++){
            sum += nums[i];
            map.put(nums[i-1], sum);
        }
        return sum;
    }
}
