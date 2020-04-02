
public class StringFormatter{

    public static int totalLetters(List<String> arr){
        int n=0;
        for (String s: arr) {n+=s.length();}
        return n;
    }
    public static int basicGapWidth(List<String> arr,int l){
        return (int)(l-totalLetters(arr))/(arr.size()-1);
    }
    public static int leftoverSpaces(List<String> arr,int l){
        return l-totalLetters(arr)-basicGapWidth(arr,l)*(arr.size()-1);
    }
    public static String format(List<String> arr,int l){
        int w=basicGapWidth(arr,l),s=leftoverSpaces(arr,l);
        String g="",f=arr.get(0);
        while ((w--)>0) {g+=" ";}
        for (int i=1; i<arr.size(); i++){
            if (s>0) {f+=" "; s--;}
            f+=(g+arr.get(i));
        }
        return f;
    }
}