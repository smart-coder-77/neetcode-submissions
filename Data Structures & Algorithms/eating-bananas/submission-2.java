class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int right = 0;
        int left = 1;
        for(int i:piles){
            right = Math.max(right,i);
        }

        while(left<right){
            int mid = left+(right-left)/2;
            int hour =0;
            for(int i : piles){
                hour+=(i+mid-1)/mid;
            } 
            if(hour<=h){
              right=mid;
            }else{
               left=mid+1; 
            }
        }
        return left;
    }
}
