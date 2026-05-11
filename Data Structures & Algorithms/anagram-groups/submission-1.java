class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> result = new HashMap<>();
       for(String str : strs){
          char [] chars = str.toCharArray();
          Arrays.sort(chars);
          String sortedKey = new String(chars);
          if(!result.containsKey(sortedKey)){
             result.put(sortedKey,new ArrayList<>());
          }
        result.get(sortedKey).add(str);  
       }
       return new ArrayList<>(result.values());
    }
 
}
