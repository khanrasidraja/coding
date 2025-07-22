class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int maxsum = 0,sum=0;
       for(int i=0;i<k;i++){
        sum = (sum+nums[i]);
       }
       maxsum = sum;
       for(int i=k; i<nums.length;i++){
        sum = (sum + nums[i] - nums[i-k]);
        maxsum = Math.max(sum, maxsum);
       }
       return maxsum;
    }
    public static void main(String args[]){
        Solution s = new Solution();
        int[] nums = {1,2,3,6,9,4,5,1,0};
        int k = 3;
        int result = s.minSubArrayLen(k, nums);
        System.out.print(result);

    }
}