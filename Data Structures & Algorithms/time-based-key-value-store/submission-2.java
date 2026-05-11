class TimeMap {
     
    private Map<String,List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();     
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }

         List<Pair> pair = map.get(key);
         int left = 0;
         int right= pair.size()-1;
      
         String result ="";
         while(left<=right){
                int mid = left+(right-left)/2;
                if(pair.get(mid).timeStamp <= timestamp){
                   result = pair.get(mid).value;
                   left=mid+1;
                }else{
                    right=mid-1;
                }
     
         } 
         return result;

    }

    private static class Pair{
          int timeStamp;
          String value;

          Pair(int timeStamp,String value){
              this.timeStamp=timeStamp;
              this.value=value;
          }
    }
}
