public class DoubleLL{
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static int size;
    public static Node head;
    public static Node tail;

//-------------------add at First------------------------

    public void addFirst(int data)
    {
        //step-1 create a node
        Node newNode=new Node(data);
        if(head==null)    // if no create any node that time head and tail point to newNode
        {
            head=tail=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        size++;
    }

//--------------------remove from first-----------------------
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }else if(head==tail){   //size==1
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
//--------------------print LL-----------------------

    public void print(){ //O👎
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

//--------------------main method-----------------------


    public static void main(String[] args)
    {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(0);
        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);

    }
}
