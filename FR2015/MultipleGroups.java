
interface NumberGroup{
    boolean contains(int i);
}

class Range implements NumberGroup{
    private int min,max;
    public Range(int mn,int mx) {min=mn; max=mx;}
    public boolean contains(int i) {return (i>=min && i<=max);}
}

public class MultipleGroups implements NumberGroup{
    private List<NumberGroup> groupList;
    public boolean contains(int i){
        for (NumberGroup r: groupList){
            if (r.contains(i)) return true;
        }
        return false;
    }
}