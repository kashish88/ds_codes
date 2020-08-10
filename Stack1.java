
public class Stack1 {
   public static void main(String[] args) {
       Stack s=new Stack();
       s.push(1);
       s.push(2);
       s.push(3);
       System.out.println(s.pop());
   }
}
class Stack
{
   static int MAX=1000;
   int t;
   int a[]=new int[MAX];
   boolean isEmpty(){
       return (t<0);
   }
   Stack()
   {
       t=-1;
   }
   boolean push(int x)
   {
       if(t>=MAX-1)
       return false;
       else{
           a[++t]=x;
           return true;
       }
   }
   int pop()
   {
       if(t<0)
       return 0;
   
  else{
      int x=a[t--];
      return x;
   }
}
int peek()
{
if(t<0)
return 0;
else
{
    int x=a[t];
    return x;
}
}
}
