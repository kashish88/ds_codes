

public class LinkedList2 {
    public static void main(String[] args) {
        
    
    LinkedList2 l=new LinkedList2();
    l.push(10); 
    l.push(50); 
    l.push(21); 
    l.push(41); 
    l.push(18); 
    if (l.search(l.head, 21)) 
    System.out.println("Yes"); 
else
    System.out.println("No"); 
    }
    Node head;
    public void push(int d1) 
    { 
       
        Node n1 = new Node(d1); 
  
      
        n1.next = head; 
  
       
        head = n1; 
    } 
  
  
    public boolean search(Node head, int x) 
    { 
        Node c = head;   
        while (c != null) 
        { 
            if (c.data == x) 
                return true;    
            c = c.next; 
        } 
        return false;   
    } 
  
   
}

class Node 
{ 
    int data; 
    Node next; 
    Node(int d) 
    { 
        data = d; 
        next = null; 
    } 
} 
