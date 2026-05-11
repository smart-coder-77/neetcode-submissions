class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        int left =0;
        int right = 0;
        char[] s1Char = s1.toCharArray();
        Arrays.sort(s1Char);
        String sortedS1 = new String(s1Char);
        while(right<s2.length()){
            right = left+s1.length();
            String window = s2.substring(left,right);
            if(valid(sortedS1,window)){
                return true;
            }
                    left++;
        }
       return false;
    }

    public boolean valid(String s1 ,String window){
        char[] s1Char = window.toCharArray();
        Arrays.sort(s1Char);
        String sortedS1 = new String(s1Char);
        return s1.equals(sortedS1);
    }
}
