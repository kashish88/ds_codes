

public class LinkedList6 {
    public static void main(String[] args) {
        LinkedList6 l=new LinkedList6();
        l.push(8);
        l.push(9);
        l.push(1);
        l.push(3);
        System.out.println("Linked list is:");
        l.printList();
        l.deleteNode(1);
        System.out.println("Linked list after deletion:");
        l.printList();
    }
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;

        }
    }
    void deleteNode(int k)
    {
        Node t=head,prev=null;
        if(t!=null&&t.data==k)
        {
            head=t.next;
            return;
        }
     while(t!=null&&t.data!=k)
     {
         prev=t;
         t=t.next;
     }
     if(t==null)
     return ;
     prev.next=t.next;
    }
    public void push(int d1) 
    { 
        Node n1 = new Node(d1); 
  n1.next = head; 
        head = n1; 
    }
    public void printList()
    {
        Node t=head;
        while(t!=null)
        {
            System.out.println(t.data+" ");
            t=t.next;
        }
    }
}