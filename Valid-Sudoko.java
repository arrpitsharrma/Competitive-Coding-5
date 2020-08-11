class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null || board.length == 0){
            return true;
        }
        Set<Character> set = new HashSet();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(set.contains(board[i][j])){
                    return false;
                }
                else if(board[i][j]!='.'){
                    set.add(board[i][j]);
                }
            }
            set = new HashSet();
        }
        
        for(int j = 0; j < board[0].length; j++){
            for(int i = 0; i < board.length; i++){
                if(set.contains(board[i][j])){
                    return false;
                }
                else if(board[i][j]!='.'){
                    set.add(board[i][j]);
                }
            }
            set = new HashSet();
        }
        int x = 0; int y = 0;
        while(x<=6){
            while(y <= 6){
                for(int i = x; i < x+3; i++){
                    for(int j = y; j < y+3; j++){
                        if(set.contains(board[i][j])){
                            return false;
                        }
                        else if(board[i][j]!='.'){
                            set.add(board[i][j]);
                        }
                    }
                }
                set = new HashSet();
                y+=3;
            }
            y=0;
            x+=3;
        }
    return true;
    }
}
