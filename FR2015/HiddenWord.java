

public class HiddenWord{
    private String word;
    public HiddenWord(String w) {word=w;}
    public String getHint(String str){
        String s="";
        for (int i=0; i<str.length(); i++){
            if (word.charAt(i)==str.charAt(i)) {s+=word.charAt(i);}
            else if (word.indexOf(str.charAt(i))!=-1) {s+="+";}
            else {s+="*";}
        }
        return s;
    }
}