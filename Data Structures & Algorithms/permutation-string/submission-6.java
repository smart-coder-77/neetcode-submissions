class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int start=0;
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> wndMap = new HashMap<>();
     for(int end =0;end<s2.length();end++){
    wndMap.put(s2.charAt(end),wndMap.getOrDefault(s2.charAt(end),0)+1);

    if(end-start+1>s1.length()){
            wndMap.put(s2.charAt(start),wndMap.get(s2.charAt(start))-1);
            if(wndMap.get(s2.charAt(start))==0){
                wndMap.remove(s2.charAt(start));
            }
            start++;
     }
         if(wndMap.equals(map)){
        return true;
    }
     }
     return false;
    }
}
