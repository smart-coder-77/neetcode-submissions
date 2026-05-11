class Solution {
    public int maxArea(int[] heights) {
        int waterRetention = 0;
        int left = 0;
        int right = heights.length-1;
        
        while(left<right){
            int width = right-left;
            int height = Math.min(heights[left],heights[right]);
            int totalCurrentWater = width * height;
            if(totalCurrentWater>waterRetention){
                waterRetention=totalCurrentWater;
            }
            if(heights[left]>heights[right]){
                 right--;
            }else if(heights[left]<heights[right]){
               left++;
            }else{
               left++;
               right--;
            }
        }
         return waterRetention;
    }
}
