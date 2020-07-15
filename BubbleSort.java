
import java.util.Scanner;
/**
 * BubbleSort
 */

public class BubbleSort {

    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
    a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
    for(int j=i+1;j<n;j++)
    {
           if(a[i]>a[j])
           {
               int s1=a[i];
               a[i]=a[j];
               a[j]=s1;
           }
    }
}
for(int i=0;i<n;i++)
{
    System.out.println(a[i]);
}
s.close();
    }
}