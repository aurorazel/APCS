
public class Digits{
    private ArrayList<Integer> digitList;
    public Digits(int n){
        digitList=new ArrayList<Integer>();
        if (n==0) {digitList.add(0);}
        while (n>0){
            digitList.add(0,n%10);
            n/=10;
        }
    }
    public boolean isStrictlyIncreasing(){
        for (int i=1; i<digitList.size(); i++){
            if (digitList.get(i-1).intValue()>=digitList.get(i).intValue()) return false;
        }
        return true;
    }
}