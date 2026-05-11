class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i=0;i<matrix.length;i++){
            if(validSearch(matrix[i],target)) return true;
        }
        return false;
    }

    public boolean validSearch(int[] arr,int target){
        int left =0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]<target){
                left = mid+1;
            }else if(arr[mid]>target){
                right=mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}
