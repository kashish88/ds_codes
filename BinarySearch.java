import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int e=s.nextInt();
        int index = search(a,  e); 
        if (index == -1) 
            System.out.println("Element is not present in the array"); 
        else
            System.out.println("Element found at position " + index); 
        s.close();
    }
   static int search(int a[], int e) 
    { 
        int l = 0, r = a.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            
            if (a[m] == e) 
                return m; 
  
         
            if (a[m] < e) 
                l = m + 1; 
  
         
            else
                r = m - 1; 
        } 
  
        
        return -1; 
    } 
  
}