

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList3 l=new LinkedList3();
        l.append(10); 
        l.push(50); 
        l.push(21); 
        l.append(41); 
        l.push(18);
        l.after(l.head.next,9);
        System.out.println("\n Linked list is: "); 
        l.printList();
    }
    Node head;   
  
   
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; } 
    } 
    public void push(int d1)
    {
        Node n1=new Node(d1);
        n1.next=head;
        head=n1;
    }
    public void after(Node p,int d1)
    {
        if(p==null)
        return ;
        Node n1=new Node(d1);
        n1.next=p.next;
        p.next=n1;
    }
    public void append(int d1) 
    { 
      
        Node n1 = new Node(d1); 
  
       
        if (head == null) 
        { 
            head = new Node(d1); 
            return; 
        } 
  
       
        n1.next = null; 
  
       
        Node last = head;  
        while (last.next != null) 
            last = last.next; 
  
       
        last.next = n1; 
        return; 
    } 
    public void printList() 
    { 
        Node t1 = head; 
        while (t1 != null) 
        { 
            System.out.print(t1.data+" "); 
            t1 = t1.next; 
        } 
    } 
}