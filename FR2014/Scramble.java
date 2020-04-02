

public class Scramble{
    public static String scrambleWord(String str){
        String s=""; int i=1;
        while (i<str.size()){
            char c1=str.charAt(i-1),c2=str.charAt(i);
            if (c1=="A" && c2!="A") {s+=(c2+"A"); i+=2;}
            else {s+=c1; i++;}
        }
    }
    public static void scrambleOrRemove(List<String> arr){
        int i=0;
        while (i<arr.size()){
            String s=scrambleWord(arr.get(i));
            if (arr.get(i).equals(s)) {arr.remove(i);}
            else {arr.set(i,s); i++;}
        }
    }
}