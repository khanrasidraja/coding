
import java.util.Arrays;

public class prefixsum {
    public static int[] presum(int[] nums){
         int[] presum=new int[nums.length];
            presum[0]=nums[0];
            for(int i=1;i<nums.length;i++){
                presum[i] = presum[i-1]+nums[i];}
           return presum;
        }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        // i ans = Arrays.toString(presum((nums)));
        Syste.err.println(Arrays.toString(presum(nums)));
    }
}
