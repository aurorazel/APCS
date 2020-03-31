public class Delimiters
{
    /** The open and close delimiters. */
    private String openDel;
    private String closeDel;
    /** Constructs a Delimiters object where open is the open delimiter and close is the
     * close delimiter.
     * Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }
    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens)
    {
        List<String> arr=new ArrayList<String>();
        for (String s: tokens){
            if (s.equals(openDel) || s.equals(closeDel)) arr.add(s);
        }
        return arr;
    }
    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     * Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters)
    {
        int k=0;
        for (String s: delimiters){
            if (s.equals(openDel)) k++;
            else k--;
            if (k<0) return false;
        }
        return (k==0);
    }
    // There may be instance variables, constructors, and methods that are not shown.
}