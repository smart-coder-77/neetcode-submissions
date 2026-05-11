class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*Lets do it using left pass and right pass process
        */
        //lets do the left pass 
        int length= nums.length;
        int [] result = new int[length];
        result[0] =1;
        for(int i=1;i<length;i++){
            result[i]=result[i-1]*nums[i-1];
        }
       //lets do the right pass and calculation
        int rightValue = 1;
        for(int i=length-1;i>=0;i--){
            result[i]=rightValue*result[i];
            rightValue *=nums[i];
        }
     return result;
    }
}  
