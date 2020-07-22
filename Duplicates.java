

import java.util.HashSet;
import java.util.Set;
public class Duplicates {
    public static void main(String[] args) {
        
    
   int []a={0,4,0,-1,8,-1,6,7,10,8};
   Set<Integer>set=new HashSet<Integer>();
   for(int i=0;i<a.length;i++)
   {
              if(set.add(a[i])==false)
              {
                  System.out.println(a[i]);
              }
   }

  

}


}