class Solution {
    public int[] productExceptSelf(int[] nums) {
         //how I am resolving this by prefix and suffix 
         int [] res = new int [nums.length];
         //[1,2,4,6]
         int prefix =1;
         for(int i=0;i<nums.length;i++){
            res[i] = prefix;
            prefix*=nums[i];
         }
         // res = 1,1,2,8
        int postFix =1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]*=postFix;
            postFix *= nums[i];
        }
        // res = [,48,24,12,8]
        return res;
    }
}  
