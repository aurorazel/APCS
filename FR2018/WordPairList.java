
public class WordPairList{
    private ArrayList<WordPair> allPairs;
    public WordPairList(String[] words){
        allPairs=new ArrayList<WordPair>();
        int l=words.length;
        for (int i=0; i<l-1; i++){
            for (int j=i+1; j<l; j++){
                allPairs.add(new WordPair(words[i],words[j]));
            }
        }
    }
    public int numMatches(){
        int n=0;
        for (WordPair p: allPairs){
            if (p.getFirst().equals(p.getSecond())) n++;
        }
        return n;
    }
}