class Solution {
    public boolean isAnagram(String s, String t) {
                    if(s.length()!=t.length()) return false;
                    int [] charArray = new int [26];
                    for (int i=0;i<s.length();i++){
                        int index = s.charAt(i)-'a';
                        charArray[index]++; 
                    }
                    for(int i=0;i<t.length();i++){
                        int index = t.charAt(i)-'a';
                         charArray[index]--; 
                    }
                    for(int i=0;i<charArray.length;i++){
                     if(charArray[i]!=0){
                            return false;
                         }   
                    }
        return true;
    }
}
