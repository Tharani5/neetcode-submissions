class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap();
    //    int a[] = new int[];
       for(int i=0;i<nums.length;i++){
        map.put(nums[i], i);
       } 
       for(int i=0;i<nums.length;i++){
        int fnum = target - nums[i];
        if(map.containsKey(fnum) && map.get(fnum)!=i){
            return new int[]{i, map.get(fnum)};
        }
       }
       return new int[]{};
    }
}
