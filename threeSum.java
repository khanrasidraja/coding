import java.util.*;
public class threeSum {
    public static void main(String args[]){
       int[] nums = {-1,0,1,2,-1,-4};
       System.out.print(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length - 1;
        for (int i = 0; i < n-1; i++) {
            int left = i+1, right = n, target = 0;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == target){
                    list.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left++;
                    right--;
                }
                else if(sum < target){
                    left++;
                }
                else{
                    right++;
                }
            }
        }
        return list;
    }
}
