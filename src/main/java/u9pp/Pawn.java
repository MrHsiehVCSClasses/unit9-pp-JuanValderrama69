package u9pp.Chess;
public class Pawn extends ChessPiece{
public Pawn(ChessPiece[][] board, int row, int col, boolean isWhite){
 super(board, row, col, isWhite);
}
  @Override 
  public boolean canMoveTo(int row, int col){
    if(this.isWhite()){
     if(this.row == 6 && row == 4 && col == this.col && this.board[row][col] == null && this.board[row -1][col] == null){
       return true;
     } 
      else if(row == this.row -1 && col == this.col && this.board[row][col] == null){
        return true;
      }
      else if(this.board[row][col] != null && this.board[row][col].isWhite() != this.isWhite()){
        if(row == this.row -1 && col == this.col -1){
          return true;
        }
        else if(row == this.row -1 && col == this.col +1){
          return true;
        }
      }
    }
    else{
     if(this.row == 1 && row == 3 && col == this.col && this.board[row][col] == null && this.board[row +1][col] == null){
       return true;
     } 
      else if(row == this.row +1 && col == this.col && this.board[row][col] == null){
        return true;
      }
      else if(this.board[row][col] != null && this.board[row][col].isWhite() != this.isWhite()){
        if(row == this.row +1 && col == this.col -1){
          return true;
        }
        else if(row == this.row +1 && col == this.col +1){
          return true;
        }
      }  
    }
    return false;
  }
  @Override
  public String toString(){
    if(this.isWhite()){
      return "P";
    }
    else return "p";
    }
  }