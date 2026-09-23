class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int max=nums[0];
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
            for(int j=1;j<nums.length;j++){
                sum= Math.max(nums[j],sum+nums[j]);
                max=Math.max(max,sum);
            }
        // }
        return max;
    }
}
