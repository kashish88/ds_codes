
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList1 list=new LinkedList1();
		list=insertAtBeg(list,1);
		list=insertAtBeg(list,2);
		list=insertAtBeg(list,3);
		list=insertAtBeg(list,4);
		list=insertAtBeg(list,5);
		list=insertAtBeg(list,6);
		list=insertAtBeg(list,7);
		list=insertAtBeg(list,8);
		list=insertAtBeg(list,9);
		list=insertAtBeg(list,10);
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
    static LinkedList1 insertAtBeg(LinkedList1 list , int data)
	{
        Node n1 = new Node(data); 
        n1.next = list.head; 
        list.head=n1;
        return list;
	}
	static void printList(LinkedList1 list)
	{
		Node n3=list.head;
		while(n3!=null)
		{
			System.out.println(n3.data+" ");
			n3=n3.next;
		}
	}
}