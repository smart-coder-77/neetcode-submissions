class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         Deque<Integer> deque = new ArrayDeque<>();
         int [] result = new int[temperatures.length];
         for(int i=0;i<temperatures.length;i++){
                 if(deque.isEmpty()){
                    deque.push(i);
                 }else{
                    while(!deque.isEmpty() && temperatures[deque.peek()]<temperatures[i]){
                        result[deque.peek()]=i-deque.peek();
                        deque.pop();
                    }
                    deque.push(i);
                 }

         }
         return result;
    }
}
