package u9pp.Chess;
public class Rook extends ChessPiece{
public Rook(ChessPiece[][] board, int row, int col, boolean isWhite){
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
    return false;
  }
  @Override
  public String toString(){
     if(this.isWhite()){
      return "R";
    }
    else return "r";
    }
    }
  