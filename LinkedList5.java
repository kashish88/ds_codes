

public class LinkedList5 {
    public static void main(String[] args) {
        LinkedList5 list = new LinkedList5(); 
        list.head = new Node(75); 
        list.head.next = new Node(20); 
        list.head.next.next = new Node(24); 
        list.head.next.next.next = new Node(30); 
    
        System.out.println("Given Linked list"); 
        list.printList(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(head); 
    }
    static Node head;
        static class Node{
            int data;
            Node next;
            Node(int d)
            {
                data=d;
                next=null;
            }
        }
        Node reverse(Node node)
        {
            Node prev=null;
            Node c=node;
            Node next=null;
            while(c!=null)
            {
                next=c.next;
                c.next=prev;
                prev=c;
                c=next;

            }
            node=prev;
            return node;
        }
        void printList(Node node) 
        { 
            while (node != null) { 
                System.out.print(node.data + " "); 
                node = node.next; 
            } 
        }   
}