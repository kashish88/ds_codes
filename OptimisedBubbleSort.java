import java.util.*;
public class OptimisedBubbleSort {
    public static void main(String[] args) {
        int n;
        boolean swapped =false;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       for(int j=0;j<n-1;j++){
           for(int k=0;k<n-j-1;k++){
               if(a[k]>a[k+1]){
                   int temp;
                   temp=a[k];
                   a[k]=a[k+1];
                   a[k+1]=temp;
                   swapped=true;
               }
           }
           if(swapped==false)
           break;
       }
       for(int h=0;h<n;h++){
        System.out.println(a[h]+" ");
    }
        sc.close();
}
}