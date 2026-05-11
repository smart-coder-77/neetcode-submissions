class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Lets do the BFA 
        //Lets check row first 
        
        for(int i=0;i<9;i++){
          if(!validateRow(board,i)){
            return false;
          }
        }    
        //second check cololomn 
        for(int i=0;i<9;i++){
           if(!validateColoumn(board,i)){
            return false;
           }
        } 
        
        for(int i=0;i<9;i+=3){
             for(int j=0;j<9;j+=3){
                if(!validateBlock(i,j,board)){
                    return false;
                }
             }
        }
    
        return true;
      
    }

    public boolean validateBlock(int row,int coloumn,char[][] board){
          boolean[] seen = new boolean[10];
          for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                int currentValue = board[row+i][coloumn+j];
                if(currentValue!='.'){
                int value =currentValue-'0'; 
                if(seen[value])return false;
                seen[value]= true;
                }
                
            }
          }
          return true;
    }
    //helper method to validate row and coloumn
    public boolean validateRow(char[][] board , int val){
        boolean[] seen = new boolean[10];
        for(int j=0;j<9;j++){
            int currentValue = board[val][j];
            if(currentValue!='.'){
                int value =currentValue-'0'; 
                if(seen[value]) return false;
                seen[value]=true;
            }
            
        }
        return true;
    }
        public boolean validateColoumn(char[][] board , int val){
        boolean[] seen = new boolean[10];
        for(int j=0;j<9;j++){
            int currentValue = board[j][val];
            if(currentValue!='.'){
                int value =currentValue-'0';
                if(seen[value]) return false;
                seen[value]=true;
            }
        }
         return true;
    }
}
