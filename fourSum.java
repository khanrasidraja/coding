import java.util.*;
public class fourSum {
    public static void main(String args[]){
      int nums[] = {-1,0,-5,-2,-2,-4,0,1,-2};
      int target = -9;
      System.out.print(fourSum(nums,target));
    }
        public static List<List<Integer>> fourSum1(int[] nums, int target) {
            List<List<Integer>> list = new ArrayList<>();
            int left = 0, sum = 0,k = 4;
            for(int right=0;right<nums.length;right++) {
                sum += nums[right];
                if((right-left+1)==k) {
                    if (sum == target) {
                        List<Integer> sublist = new ArrayList<>();
                        for (int i = left; i <= right; i++) {
                            sublist.add(nums[i]);
                        }
                        list.add(sublist);
                    }
                    sum -= nums[left];
                    left++;
                }
            }
      return list;

        }
    public static List<List<Integer>> fourSum4(int[] nums, int target) {
        Arrays.sort(nums);
    int sum = 0;
    List<List<Integer>> list = new ArrayList<>();
           for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            int p =j+1, q=nums.length-1;
            while(p<q){
                sum = nums[i]+nums[j]+nums[p]+nums[q];
                if(sum<target){
                    p++;
                }
                else if(sum>target){
                    q--;
                }
                else{
                   list.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[p],nums[q])));
                    p++;
                    q--;
                }
            }}
    }
      return list;
    }

    public static List<List<Integer>> fourSum5(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        long sum = 0;
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            for(int j=i+1; j<n-1; j++){
                if(j!=i+1 && nums[j]==nums[j-1])continue;
                int p = j+1, q = n-1;
                while(p<q){
                    sum = 1L*nums[i]+nums[j]+nums[p]+nums[q];
                    if(sum == target){
                        list.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[p],nums[q])));
                        p++;
                        q--;
                        while(p<q && nums[p]==nums[p-1])p++;
                        while(p<q && nums[q]==nums[q+1])q--;
                    }
                    else if(sum < target) p++;
                    else q--;
                }
            }
        }
        return list;
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        long sum = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1])
                    continue;
                int left = j + 1, right = nums.length - 1;
                while (left < right) {
                    sum = 1L * nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target)
                        right--;
                    else if (sum < target)
                        left++;
                    else {
                        list.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[left],nums[right])));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1])
                            left++;
                        while (left < right && nums[right] == nums[right + 1])
                            right--;
                    }
                }
            }
        }
        return list;
    }

}