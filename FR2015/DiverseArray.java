
public class DiverseArray{  // check

    public static int arraySum(int[] arr){
        int n=0;
        for (int i: arr) {n+=i;}
        return n;
    }
    public static int[] rowSums(int[][] arr){
        int[] sums=new int[arr.length];
        for (int i=0; i<arr.length; i++) {sums[i]=arraySum(arr[i]);}
        return sums;
    }
    public static boolean isDiverse(int[][] arr){
        int[] sums=rowSums(arr);
        for (int i=0; i<sums.length-1; i++){
            for (int j=i+1; j<sums.length; j++){
                if (sums[i]==sums[j]) return false;
            }
        }
        return true;
    }
}