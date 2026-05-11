class Solution {
    public int characterReplacement(String s, int k) {
         int left =0;
         int maxFrequency = 0;
         int maxLength = 0;
         int[] counts =  new int [26];
         for(int right =0;right<s.length();right++){
            counts[s.charAt(right)-'A']++;
            maxFrequency = findMaxFrequency(counts);
            while((right-left+1)-maxFrequency>k){
                counts[s.charAt(left)-'A']--;
                left++;
                maxFrequency = findMaxFrequency(counts);
            }

            maxLength = Math.max(maxLength,right-left+1);
         }


         return maxLength;
    }

    public int findMaxFrequency(int [] counts){
        int max =0;
        for(int count : counts){
            max= Math.max(max,count);
        }
        return max;
    }
}
