

public class LinkedList4 {
        public static void main(String[] args) {
            LinkedList4 l1=new LinkedList4();
            l1.push(20);
            l1.push(10);
            l1.push(15);
            l1.push(18);
            l1.head.next.next.next.next=l1.head;
            l1.detectLoop();


        }
        Node head;
        class Node{
            int data;
            Node next;
            Node(int d)
            {
                data=d;
                next=null;
            }
        }
        public void push(int d1)
        {
            Node n1=new Node(d1);
            n1.next=head;
            head=n1;
        }
        void detectLoop()
        {
            Node s1=head;Node f1=head;
            int f=0;
            while(s1!=null&&f1!=null&&f1.next!=null)
            {
                s1=s1.next;
                f1=f1.next.next;
                if(s1==f1)
                {
                    f=1;
                    break;
                }
            }
            if(f==1)
            {
                System.out.println("Loop found");
            }
            else{
                System.out.println("Loop not found");
            }
        }
}