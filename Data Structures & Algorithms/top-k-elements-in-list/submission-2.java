class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> map = new HashMap<>();
         for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
         }
         List<Integer> [] buckets = new List[nums.length+1];
         for(int key : map.keySet()){
              int value = map.get(key);
              if(buckets[value]==null){
               buckets[value] = new ArrayList<>(); 
              }
              buckets[value].add(key);
         }
         List<Integer>  result = new ArrayList<>();
         for(int i=buckets.length-1;i>=0 && result.size()<k;i--){
              if(buckets[i]!=null){
                result.addAll(buckets[i]);
              }
         }
     return result.stream().mapToInt(i->i).toArray();
    }
}
