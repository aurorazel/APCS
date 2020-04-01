
public interface StringChecker{ // public ?
    boolean isValid(String str);
}

public class CodeWordChecker implements StringChecker{
    private int minLen,maxLen;
    private String badStr;
    public CodeWordChecker(String bs) {minLen=6; maxLen=12; badStr=bs;} 
    public CodeWordChecker(int mn,int mx,String bs) {minLen=mn; maxLen=mx; badStr=bs;}
    public boolean isValid(String str){
        int l=str.length();
        return (l>=minLen && l<=maxLen && str.indexOf(badStr)==-1) // check
    }
}