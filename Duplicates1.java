import static java.lang.Math.*;
public class Duplicates1 {
    public static void main(String[] args) {
        int arr[] = {1,4,2,2,1,3};
        for(int i=0;i<arr.length;i++){
            if(arr[abs(arr[i])] >= 0){
                arr[Math.abs(arr[i])] = - arr[Math.abs(arr[i])];
            }
            else
                System.out.print(Math.abs(arr[i])+ " ");
        }
    }
}