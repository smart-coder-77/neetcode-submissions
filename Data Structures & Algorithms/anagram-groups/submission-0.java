class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result  = new ArrayList<>();
        boolean [] visited = new boolean[strs.length]; 
            for(int i=0;i<strs.length;i++){
            if(visited[i]) continue;
            String str = strs[i];
            List<String> list = new ArrayList<>();
            list.add(str);
            for(int j=i+1;j<strs.length;j++) {
            if(validAnagram(str,strs[j]) && !visited[j]){
            list.add(strs[j]);
            visited[j]=true;
            }
            } 
            result.add(list);
            } 
       return result;     
    }

    public boolean validAnagram(String a ,String b){
        if(a!=null && b!=null){
        char [] charA = a.toCharArray();
        char [] charB = b.toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);
        String sortedA = new String(charA); 
        String sortedB = new String(charB);  
        return sortedA.equals(sortedB);
        }
       return false;
    }
}
