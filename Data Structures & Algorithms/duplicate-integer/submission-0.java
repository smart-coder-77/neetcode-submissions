class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueElement = new HashSet<>();
        for(int i : nums){
            if(!uniqueElement.add(i)){
                return true;
            }
        }
        return false;
    }
}