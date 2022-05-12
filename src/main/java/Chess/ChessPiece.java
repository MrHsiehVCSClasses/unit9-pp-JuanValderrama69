package u9pp.Chess;
public abstract class ChessPiece{
  public ChessPiece[][] board;
 public int row;
public int col;
  private boolean isWhite;
public ChessPiece(ChessPiece[][] board, int row, int col, boolean isWhite){
  this.board = board;
  this.row = row;
  this.col = col;
    this.isWhite = isWhite;
}
public boolean canMoveTo(int row, int col){
  return false;
}
  public void doMove(int row, int col){
    ChessPiece temp = this.board[this.row][this.col];
   this.board[this.row][this.col] = null;
    this.board[row][col] = temp;
  }
public abstract String toString();
  public boolean isWhite(){
return this.isWhite;
}
}