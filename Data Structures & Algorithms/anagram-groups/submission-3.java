class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          Map<String,List<String>> map = new HashMap<>();
          for(String s : strs){
                char [] ch = new char[26];
                for(char c : s.toCharArray()){
                     ch[c-'a']++;
                }
                String key = new String(ch);
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(s);
          }
        return new ArrayList<>(map.values());
    }
}
