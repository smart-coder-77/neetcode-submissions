class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer,Integer> map = new HashMap<>();
         for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
         }
         
         List<Integer> [] buckets = new List[nums.length+1];
         for(int i : map.keySet()){
             int value = map.get(i);
             if(buckets[value]==null){
                 buckets[value] = new ArrayList<>();
             }
             buckets[value].add(i);
         }
         int [] result = new int [k];
         int index=0;
         for(int j = buckets.length-1;j>=0 && index<k;j--){
               if(buckets[j]!=null){
                   for(int i : buckets[j]){
                        result[index++] =i;
                        if(index==k) break;
                   }
               }
         }

    return result;
    } 
}
