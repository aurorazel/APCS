

class Square{
    public Square(boolean isBlack,int num){
        //
    }
}

public class Crossword{
    private Square[][] puzzle;
    public Crossword(boolean[][] blackSquares){
        puzzle=new Square[blackSquares.length][blackSquares[0].length];
        int n=0;
        for (int i=0; i<blackSquares.length; i++){
            for (int j=0; j<blackSquares[0].length; j++){
                boolean b=false; int k=0;
                if (blackSquares[i][j]) {b=!b;}
                else if (toBeLabeled(i,j,blackSquares)) {k=n++;}
                puzzle[i][j]=new Square(b,n);
            }
        }
    }
    private boolean toBeLabeled(int r,int c,boolean[][] blackSquares){
        return (!blackSquares[r][c] && (r==0 || c==0 || blackSquares[r-1][c] || blackSquares[r][c-1]));
    }
}