
class SparseArrayEntry{
    private int row,col,value;
    public SpareArrayEntry(int r,int c,int v) {row=r; col=c; value=v;}
    public int getRow() {return row;}
    public int getCol() {return col;}
    public int getValue() {return value;}
}

public class SparseArray{
    private int numRows,numCols;
    private List<SparseArrayEntry> entries;
    public SparseArray() {entries=new SparseArray();}
    public int getNumRows() {return numRows;}
    public int getNumCols() {return numCols;}
    public int getValueAt(int r,int c){
        for (SparseArrayEntry e: entries){
            if (e.getRow()==r && e.getCol()==c) {return e.getValue();}
        }
        return 0;
    }
    public void removeColumn(int c){
        SparseArrayEntry e,t;
        for (int i=0; i<entries.size(); i++){
            e=entries.get(i);
            if (e.getCol()==c) {entries.remove(i); i--;}
            else if (e.getCol()>c){
                t=new SparseArrayEntry(e.getRow(),e.getCol()-1,e.getValue());
                entries.set(i,t);
            }
        }
        numCols--;
    }
}