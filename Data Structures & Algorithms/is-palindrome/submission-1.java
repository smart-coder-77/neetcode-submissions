class Solution {
    public boolean isPalindrome(String s) {
         int i=0;
         int j=s.length()-1;
         while(i<j){
            Character intial = s.charAt(i);
            Character end = s.charAt(j);

            if(!Character.isLetterOrDigit(intial)){
                i++;
            }else if(!Character.isLetterOrDigit(end)){
                j--;
            }else{
                if(Character.toLowerCase(intial)!=Character.toLowerCase(end)){
                    return false;
                }
                i++;
                j--;
            }
         }
         return true;
    }
}
