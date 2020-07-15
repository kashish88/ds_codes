import java.util.*;
public class LinearSearch {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int e=s.nextInt();
        int index = search(a, n, e); 
        if (index == -1) 
            System.out.println("Element is not present in the array"); 
        else
            System.out.println("Element found at position " + index); 
        s.close();
     }
     static int search(int a[],int n,int e)
     {
        for (int i = 0; i < n; i++) { 
           
            if (a[i] == e) 
                return i; 
        } 
  
      
        return -1; 
     }
}