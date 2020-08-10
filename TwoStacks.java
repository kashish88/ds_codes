
public class TwoStacks{
    public static void main(String[] args) {
        TwoStacks t = new TwoStacks(0); 
        t.push1(8);
        t.push2(10);
        t.push2(12);
        t.push1(11);
        t.push2(5);
        System.out.println(t.pop1());
        System.out.println(t.pop2());

    }
    int size;
    int t1,t2;
    int a[];
    TwoStacks(int n)
    {
        a=new int[n];
        size=n;
        t1=-1;
        t2=size;
    }
    void push1(int x)
    {
        if(t1<t2-1)
        {
        t1++;
        a[t1]=x;
        }
        else { 
            System.out.println("Stack Overflow"); 
           
        } 
    }
    void push2(int x)
    {
        if(t1<t2-1)
        {
        t2--;
        a[t2]=x;
        }
        else { 
            System.out.println("Stack Overflow"); 
           
        } 
    }
    int pop1(){
        if(t1>=0)
        {
            int x=a[t1];
            t1--;
            return x;
        }
        else { 
            System.out.println("Stack Underflow"); 
         
        } 
        return 0;
    }
    int pop2(){
        if(t2<size)
        {
            int x=a[t2];
            t2++;
            return x;
        }
        else { 
            System.out.println("Stack Underflow"); 
         
        } 
        return 0;
    }
}
    

