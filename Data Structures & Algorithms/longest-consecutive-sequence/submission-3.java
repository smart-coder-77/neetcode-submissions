class Solution {
    public int longestConsecutive(int[] nums) {
        //lets use Hashset Just to make it using tc O(N) and oc o(n)
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int resultLength =0;
    
        for(int number : set){
            if(!set.contains(number-1)){
                int currentNumber = number;
                int currentLength=1;
                while(set.contains(currentNumber+1)){
                    currentNumber++;
                    currentLength++;
                }
                resultLength = Math.max(resultLength,currentLength);
            } 
        }
       return resultLength;
    }
}
