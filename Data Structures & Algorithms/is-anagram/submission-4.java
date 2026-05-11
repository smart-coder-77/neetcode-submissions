class Solution {
    public boolean isAnagram(String s, String t) {
           if(s.length()!=t.length()) return false;
           int [] count = new int[26];
           char[] sChar = s.toCharArray();
           char[] tChar = t.toCharArray();
           
           for(int i=0;i<sChar.length;i++){
               count[sChar[i]-'a']++;
               count[tChar[i]-'a']--;   
           }
           
           for(int c : count){
               if(c!=0) return false;
           }
           return true;
    }
}
