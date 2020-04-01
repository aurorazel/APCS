
public class Phrase{                // Check All
    private String currentPhrase;
    public Phrase(String p){
        currentPhrase=p;
    }
    public int findNthOccurrence(String str,int n){
        int idx=0,s=0,c=0;
        while (c<n){
            int i=currentPhrase.indexOf(str,s);
            if (i==-1) return -1;
            c++; idx=i; s=idx+str.length();
        }
        return idx;
    }
    public void replaceNthOccurrence(String str1,int n,String str2){
        int idx=findNthOccurrence(str1,n);
        if (idx==-1) return -1;
        int l1=str1.length(),l=currentPhrase.length();
        currentPhrase=currentPhrase.substring(idx)+str2+currentPhrase.substring(idx+l1,l);
    }
    public void findLastOccurrence(String str){
        int idx=-1,n=0;
        while (true){
            int i=findNthOccurrence(str,n++);
            if (i==-1) return idx;
            idx=i;
        }
    }
    public String toString(){
        return currentPhrase;
    }
}