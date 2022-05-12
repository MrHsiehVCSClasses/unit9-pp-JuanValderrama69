package u9pp.Chess;
public class Knight extends ChessPiece{
public Knight(ChessPiece[][] board, int row, int col, boolean isWhite){
  super(board, row, col, isWhite);
}
  @Override
  public boolean canMoveTo(int row, int col){
    if(row == this.row +2){
      if(col == this.col +1 || col == this.col -1){
        if(this.board[row][col] != null && this.board[row][col].isWhite() == this.isWhite()){
       return false;
     }
        return true;
      }
    }
    else if(row == this.row -2){
      if(col == this.col +1 || col == this.col -1){
        if(this.board[row][col] != null && this.board[row][col].isWhite() == this.isWhite()){
       return false;
     }
        return true;
      }
    }
  else if(col == this.col +2){
    if(row == this.row +1 || row == this.row -1){if(this.board[row][col] != null && this.board[row][col].isWhite() == this.isWhite()){
       return false;
     }
      return true;
    }
  }
    else if(col == this.col -2){
    if(row == this.row +1 || row == this.row -1){
      if(this.board[row][col] != null && this.board[row][col].isWhite() == this.isWhite()){
       return false;
     }
      return true;
    }
  }
    return false;
    }
  @Override
  public String toString(){
    if(this.isWhite()){
      return "N";
    }
    else return "n";
    }
    }
  