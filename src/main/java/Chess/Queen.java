package u9pp.Chess;
public class Queen extends ChessPiece{
public Queen(ChessPiece[][] board, int row, int col, boolean isWhite){
  super(board, row, col, isWhite);
}
  @Override
  public boolean canMoveTo(int row, int col){
    if(row == this.row ){
      if(this.board[row][col] != null && this.board[row][col].isWhite() == this.isWhite()){
       return false;
     }
      for(int i = this.col; i < col; i++){
        if(this.board[row][i] != null){
          return false;
        }
      }
      return true;
    }
    else if(col  == this.col){
      if(this.board[row][col] != null && this.board[row][col].isWhite() == this.isWhite()){
       return false;
     }
      for(int i = this.row; i < row; i++){
        if(this.board[i][col] != null){
          return false;
        }
      }
      return true;
    }
    if(this.row - row == this.col - col){
     if(this.board[row][col] != null && this.board[row][col].isWhite() == this.isWhite()){
       return false;
     }
     int i = this.row -1;
     int j = this.col -1;
     while(i > row && j > col){
       if(this.board[i][j] != null){
         return false;
       }
       else{
         i--;
         j--;
       }
     }
     return true;
   } 
    else if(this.row - row == col - this.col){
      if(this.board[row][col] != null && this.board[row][col].isWhite() == this.isWhite()){
       return false;
     }
      int i = this.row -1;
     int j = this.col +1;
     while(i > row && j < col){
       if(this.board[i][j] != null){
         return false;
       }
       else{
         i--;
         j++;
       }
     }
      return true;
    }
    else if(row - this.row == this.col - col){
      if(this.board[row][col] != null && this.board[row][col].isWhite() == this.isWhite()){
       return false;
     }
      int i = this.row +1;
     int j = this.col -1;
     while(i < row && j > col){
       if(this.board[i][j] != null){
         return false;
       }
       else{
         i++;
         j--;
       }
     }
      return true;
    }
    else if(row - this.row == col - this.col){
      if(this.board[row][col] != null && this.board[row][col].isWhite() == this.isWhite()){
       return false;
     }
      int i = this.row +1;
     int j = this.col +1;
     while(i < row && j < col){
       if(this.board[i][j] != null){
         return false;
       }
       else{
         i++;
         j++;
       }
     }
      return true;
      }
    return false;
    }
  @Override
  public String toString(){
    if(this.isWhite()){
      return "Q";
    }
    else return "q";
    }
    }
  