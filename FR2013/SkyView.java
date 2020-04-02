
public class SkyView{
    private double[][] view;
    public SkyView(int r,int c,double[] scanned){
        view=new double[r][c];
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                int k=0;
                if (i%2!=0) k=c-1;    // (i%2==0)?k=0;k=c-1
                view[i][j+k]=scanned[c*i+j];
            }
        }
    }
    public double getAverage(int r1,int r2,int c1,int c2){
        double n=0;
        for (int r=r1; r<=r2; r++){
            for (int c=c1; c<=c2; c++) {n+=view[r][c];}
        }
        return n/((r2-r1+1)*(c2-c1+1));
    }
}




