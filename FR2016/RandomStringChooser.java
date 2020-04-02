

public class RandomStringChooser{
    private List<String> words;
    public RandomStringChooser(String[] arr){
        words=new ArrayList<Integer>();
        for (String s: arr) {words.add(s);}
    }
    public String getNext(){
        if (words.size()==0) return "NONE";
        int i=(int)(Math.random()*words.size());
        return words.remove(i);
    }
}

class RandomLetterChooser extends RandomStringChooser{
    public RandomLetterChooser(String str) {super(getSingleLetters(str));}
    public static String[] getSingleLetters(String str){
        //
    }

}