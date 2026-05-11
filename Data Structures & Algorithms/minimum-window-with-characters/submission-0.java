class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
        int left =0;
        int right =0;
        int [] charArray = new int [128];
        int minLength = Integer.MAX_VALUE;
        int reqired = t.length();
        int startIndex =0;

        for(char c : t.toCharArray()){
            charArray[c]++;
        }
        while(right<s.length()){
           char rc = s.charAt(right);
           if(charArray[rc]>0){
            reqired--;
           }
           right++;
           charArray[rc]--;

           while(reqired==0){
               if(minLength>right-left){
                   minLength = right-left;
                   startIndex = left;
               }

              char lc= s.charAt(left);
              charArray[lc]++;
              if(charArray[lc]>0){
                reqired++;
              }
              left++;
           }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(startIndex,startIndex+minLength);
    }
}
