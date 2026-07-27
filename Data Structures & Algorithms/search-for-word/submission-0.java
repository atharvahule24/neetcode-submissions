class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(backtrack(board , i , j , 0 , word)){
                    return true;
                }
        }
        }
        return false;
    }

    public boolean backtrack(char[][] board , int i , int j , int strIdx , String word){
        
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length){
            return false;
        }if(board[i][j] != word.charAt(strIdx)){
            return false;
        }
        if(strIdx == word.length() - 1){
            return true;
        }
        char tmp = board[i][j];
        board[i][j] = '#';
        boolean found = backtrack(board , i - 1 ,  j , strIdx + 1 ,  word) ||
                        backtrack(board , i + 1 ,  j ,  strIdx + 1 ,  word) ||
                        backtrack(board ,  i ,  j + 1 ,  strIdx + 1 , word) ||
                        backtrack(board ,  i ,  j - 1 ,  strIdx + 1 ,  word);

        board[i][j] = tmp;
        return found;
    }
}
