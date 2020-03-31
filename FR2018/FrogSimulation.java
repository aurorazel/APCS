
public class FrogSimulation{
    private int goalDistance;
    private int maxHops;
    public FrogSimulation(int dist,int numHops){
        goalDistance=dist;
        maxHops=numHops;
    }
    private int hopDistance(){
        // implementation not shown
    }
    public boolean simulate(){
        int n=0,p=0;
        while (n<maxHops && p>=0){
            p+=hopDistance(); n++;
            if (p==goalDistance) return true;
        }
        return false;
    }
    public double runSimulations(int num){
        int n=0,t=0;
        while (n<num){
            if (simulate()) t++;
            n++;
        }
        return (double)t/num;
    }
}
