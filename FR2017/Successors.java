
class Position{
    public Position(int r,int c){
        //
    }
}

public class Successors{
    public static Position findPosition(int n,int[][] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                if (arr[i][j]==num) {return new Position(i,j);}
            }
        }
        return null;
    }
    public static Position[][] getSuccessorArray(int[][] arr){
        Position[][] succ=new Position[arr.length][arr[0].length]; // successor array
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                succ[i][j]=findPosition(arr[i][j]+1,arr);
            }
        }
        return succ;
    }
}