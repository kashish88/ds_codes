
import java.util.Stack; 

public class PrefixToPostfix {
    public static void main(String[] args) {
        String exp="*-A/BC-/AKL";
        System.out.println("Postfix:"+preToPost(exp));
    }

    static boolean isOperator(char x)
    {
        switch(x)
        {
            case '+':
            case '-':
            case '/':
            case '*':
            return true;
        }
        return false;
    }
    static String preToPost(String exp)
    {
        Stack<String>s=new Stack<String>();
        int l=exp.length();
        for(int i=l-1;i>=0;i--)
        {
                if(isOperator(exp.charAt(i)))
                {
                    String o1=s.peek();s.pop();
                    String o2=s.peek();s.pop();
                    String temp = o1 + o2 + exp.charAt(i); 
                    s.push(temp);
                }
                else{
                    s.push(exp.charAt(i)+"");
                }
        }
        return s.peek();
    }
}