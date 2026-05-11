class Solution {
    public int characterReplacement(String s, int k) {
         int left =0;
         int maxFrequency = 0;
         int maxLength = 0;
         Map<Character,Integer> map = new HashMap<>();
         for(int right =0;right<s.length();right++){
              Character r = s.charAt(right);
              map.put(r,map.getOrDefault(r,0)+1);
              maxFrequency = Math.max(maxFrequency,map.get(r));
              while((right-left+1)-maxFrequency>k){
                Character l = s.charAt(left);
                 map.put(l,map.get(l)-1);
                 left++;
              }
             maxLength = Math.max(maxLength,right-left+1);
         }
         return maxLength;
    }
}
