
public class ArrayTester{
    public static int[] getColumn(int[][] arr,int c){
        int[] col=new int[arr.length];
        for (int i=0; i<arr.length; i++) {col[i]=arr[i][c];}
        return col;
    }
    public static boolean hasAllValues(int[] arr1, int[] arr2){
        // implementation not shown
    }
    public static boolean containsDuplicates(int[] arr){
        // implementation not shown
    }
    public static boolean isLatin(int[][] arr){
        if (containsDuplicates(arr[0])) return false;
        for (int i=0; i<arr.length; i++){
            if !(hasAllValues(arr[0],getColumn(arr,i)) &&
                    hasAllValues(arr[0],arr[i])) return false;
        }
        return true
    }
}


