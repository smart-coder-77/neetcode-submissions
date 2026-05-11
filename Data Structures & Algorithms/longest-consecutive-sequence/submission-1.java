class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int currentLength=1;
        int resultLength=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) continue;
            if(nums[i]+1==nums[i+1]){
               currentLength++;
            }else{
               resultLength= Math.max(resultLength,currentLength);
               currentLength =1;
            }
        }
        return Math.max(resultLength,currentLength);
    }
}
