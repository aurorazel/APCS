
class Student{
    public String getName(){
        //
    }
    public int getAbsentCount(){
        //
    }
}

public class SeatingChart{
    private Student[][] seats;
    public SeatingChart(List<Student> arr,int r,int c){
        seats=new Student[r][c];
        for (int i=0; i<arr.size(); i++) {seats[i%r][i/r]=arr.get(i);}
    }
    public int removeAbsentStudents(int max){
        int c=0;
        for (int j=0; j<seats[0].length; j++){
            for (int i=0; i<seats.length; i++){
                if (seats[i][j]==null) return c;
                else if (seats[i][j].getAbsentCount()>max) {seats[i][j]=null; c++;}
            }
        }
    }
}