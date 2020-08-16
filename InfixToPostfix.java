import java.util.Stack;
public class InfixToPostfix {
    public static void main(String[] args) {
        String exp="a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));
    }
   static int Prec(char ch)
   {
       switch(ch)
       {
           case '+':
           case '-':
           return 1;
           
        case '*': 
        case '/': 
            return 2; 
            case '^': 
            return 3; 
       }
       return -1;
   }
   static String infixToPostfix(String exp)
   {
       String r=new String("");
       Stack<Character>st=new Stack<>();
       for(int i=0;i<exp.length();i++)
       {
        char c = exp.charAt(i); 
           if(Character.isLetterOrDigit(c))
           {
                    r+=c;
           }
           else if(c=='(')
           {
               st.push(c);
           }
           else if(c==')')
           {
               while(!st.isEmpty()&&st.peek()!='(')
               {
                r += st.pop(); 

               }
                 
               if (!st.isEmpty() && st.peek() != '(') 
               return "Invalid Expression"; 
           else
               st.pop(); 
           }
           else
           {
               while(!st.isEmpty()&&Prec(c)<=Prec(st.peek())){
                if(st.peek() == '(') 
                return "Invalid Expression"; 
            r += st.pop(); 
               }
               st.push(c);
           }
       }
       while (!st.isEmpty()){ 
        if(st.peek() == '(') 
            return "Invalid Expression"; 
        r += st.pop(); 
     } 
    return r; 
   }
}
