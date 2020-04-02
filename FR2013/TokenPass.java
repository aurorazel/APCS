

public class TokenPass{
    private int[] board;
    private int currentPlayer;
    public TokenPass(int playerCount){
        board=new int[playerCount];
        for (int i=0; i<playerCount; i++) {board[i]=(int)(Math.random()*11)+1;}
        currentPlayer=(int)(Math.random()*playerCount);
    }
    public void distributeCurrentPlayerTokens(){
        int i=currentPlayer,t=board[i];
        board[i]=0;
        while ((t--)>0){
            if ((i++)==board.length) {i=0;}
            board[i]++;
        }
    }
}