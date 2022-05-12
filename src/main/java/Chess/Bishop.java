package u9pp.Chess;
public class Bishop extends ChessPiece{
public Bishop(ChessPiece[][] board, int row, int col, boolean isWhite){
  super(board, row, col, isWhite);
}
   @Override
  public boolean canMoveTo(int row, int col){
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
      return "B";
    }
    else return "b";
    }
  }
  