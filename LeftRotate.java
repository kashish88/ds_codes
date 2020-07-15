import java.util.*;
public class LeftRotate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int d=s.nextInt();
    
        for(int i=0;i<d;i++)
        {
            rotate(a,d);
        }


        s.close();
    }
    static int c =1;
    static void rotate(int a[],int d){
 
        int len = a.length;
        int temp = a[0];
        for(int i=0;i<len-1;i++){

                    a[i] = a[i+1];
        }
        a[len-1] = temp;
if(c==d) {
    for (int i = 0; i < a.length; i++) {

        System.out.print(a[i] + " ");
    }
}
c++;
    }
}