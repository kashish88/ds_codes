
public class LinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
		list=insertAtEnd(list,1);
		list=insertAtEnd(list,2);
		list=insertAtEnd(list,3);
		list=insertAtEnd(list,4);
		list=insertAtEnd(list,5);
		list=insertAtEnd(list,6);
		list=insertAtEnd(list,7);
		list=insertAtEnd(list,8);
		list=insertAtEnd(list,9);
		list=insertAtEnd(list,10);
		printList(list);
    }
    Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int x)
		{
			data=x;
			next=null;
		}
	}
	static LinkedList insertAtEnd(LinkedList list , int data)
	{
		Node n1=new Node(data);
		if(list.head==null)
		{
			list.head=new Node(data); 
		
		}
		n1.next=null;
			Node n2=list.head;
			while(n2.next!=null)
			{
				n2=n2.next;
			}
			n2.next=n1;
		
		return list;
	}
	static void printList(LinkedList list)
	{
		Node n3=list.head;
		while(n3!=null)
		{
			System.out.println(n3.data+" ");
			n3=n3.next;
		}
	}
}