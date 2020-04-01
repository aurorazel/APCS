
public interface StudyPractice{
    String getProblem();
    void nextProblem();
}

public class MultPractice implements StudyPractice{
    private int first,second;
    public MultPractice(int f,int s){
        first=f; second=s;
    }
    public String getProblem(){
        return first+" TIMES "+second;
    }
    public void nextProblem() {second++;}
}