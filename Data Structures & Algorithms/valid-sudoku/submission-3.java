class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean [][] row = new boolean[9][9];
        boolean [][] coloumn = new boolean[9][9];
        boolean [][] boxIndex = new boolean[9][9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
               int current =board[i][j];
               int box=i/3*3+j/3;
               if(current !='.'){
                   int value = current -'1';
                   if(row[i][value] || coloumn [j][value] || boxIndex[box][value]){
                    return false;
                   }
                row[i][value] = true; 
                coloumn [j][value]=true;
                boxIndex[box][value] = true;  
               }
            }
        }
        return true;
    }
}
